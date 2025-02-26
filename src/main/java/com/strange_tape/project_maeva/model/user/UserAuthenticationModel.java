package com.strange_tape.project_maeva.model.user;

public record UserAuthenticationModel(
        String login,
        String token
) {
}
