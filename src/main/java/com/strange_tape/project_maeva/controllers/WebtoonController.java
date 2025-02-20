package com.strange_tape.project_maeva.controllers;

import com.strange_tape.project_maeva.form.webtoon.WebtoonReadContentFormData;
import com.strange_tape.project_maeva.services.WebtoonService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Tag(name = "Webtoon API")
@RestController
@RequestMapping("/webtoons")
public class WebtoonController {

    @Autowired
    private WebtoonService webtoonService;

    @Operation(
            summary = "Get all webtoons sorted by alphabetic",
            description = "Get all webtoons sorted by alphabetic"
    )
    @GetMapping
    public List getAllWebtoons() {
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
    public void createWebtoon(WebtoonReadContentFormData content) {

    }
}
