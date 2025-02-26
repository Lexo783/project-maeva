package com.strange_tape.project_maeva.controllers;

import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Tag(name = "User API")
@RestController
@RequestMapping("/users")
public class UserController {
}
