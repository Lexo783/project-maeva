package com.strange_tape.project_maeva.security;

import org.springframework.security.oauth2.jose.jws.MacAlgorithm;

import java.security.SecureRandom;

public class SecurityUtils {
    public static final String AUTHORITIES_CLAIM_KEY = "authorities";
    public static final MacAlgorithm JWT_ALGORITHM = MacAlgorithm.HS512;
}
