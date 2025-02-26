package com.strange_tape.project_maeva.security;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.config.annotation.web.configurers.HeadersConfigurer;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfiguration {

    private static final Logger log = LoggerFactory.getLogger(SecurityConfiguration.class); // Loger from slf4j

    @Autowired
    private KeycloakTokenConverter keycloakTokenConverter;

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http
                .csrf(AbstractHttpConfigurer::disable)
                .headers(headers ->
                        headers.contentSecurityPolicy(csp ->
                                        csp.policyDirectives("default-src 'self' data:; style-src 'self' 'unsafe-inline';")
                                )
                                .frameOptions(HeadersConfigurer.FrameOptionsConfig::deny)
                                .permissionsPolicyHeader(permissionsPolicy ->
                                        permissionsPolicy.policy("fullscreen=(self), geolocation=(), microphone=(), camera=()"))
                )
                .authorizeHttpRequests(authorizations ->
                        authorizations
                                .requestMatchers("/swagger-ui/**").permitAll()
                                .requestMatchers("/v3/api-docs/**").permitAll()
                                .requestMatchers("/accounts/token").permitAll()
                                .anyRequest().authenticated()
                )
                .sessionManagement(session -> session.sessionCreationPolicy(SessionCreationPolicy.STATELESS))
                .oauth2ResourceServer(oauth2 ->
                        oauth2.jwt(jwt ->
                                jwt.jwtAuthenticationConverter(keycloakTokenConverter)
                        )
                );
        return http.build();
    }
}