package com.strange_tape.project_maeva.controllers;

import com.strange_tape.project_maeva.model.webtoon.WebtoonReadContentModel;
import com.strange_tape.project_maeva.model.webtoon.WebtoonSerieModel;
import com.strange_tape.project_maeva.services.WebtoonService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.enums.SecuritySchemeType;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.security.SecurityScheme;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Tag(name = "Webtoon API")
@RestController
@RequestMapping("/webtoons")
@SecurityScheme(name = "bearerAuth", type = SecuritySchemeType.HTTP, scheme = "bearer", bearerFormat = "JWT")
public class WebtoonController {

    @Autowired
    private WebtoonService webtoonService;

    @Operation(
            summary = "Get all webtoons sorted by alphabetic",
            description = "Get all webtoons sorted by alphabetic",
            security = {@SecurityRequirement(name = "bearerAuth")}
    )
    @GetMapping
    public WebtoonSerieModel getAllWebtoons() {
        return null;
    }

    @Operation(
            summary = "Get all webtoons created by user",
            description = "Get all webtoons created by X user and alphabetic sorted"
    )
    @GetMapping("{userSlug}")
    public void  getUserWebtoons(@PathVariable String userSlug) {

    }

    @PostMapping
    public void createWebtoon(WebtoonReadContentModel content) {

    }
}
