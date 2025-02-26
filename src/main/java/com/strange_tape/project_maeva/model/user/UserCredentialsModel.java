package com.strange_tape.project_maeva.model.user;

import jakarta.validation.constraints.NotBlank;

public record UserCredentialsModel(
    @NotBlank(message = "Login is mandatory") String login,
    @NotBlank(message = "Password is mandatory") String password
    ){

}
