package com.strange_tape.project_maeva.model.webtoon;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;

public record WebtoonSerieModel(
        @NotBlank(message = "Title is mandatory") String title,
        @NotBlank(message = "summary is mandatory") String summary,
        @Valid WebtoonEpisodeModel webtoonEpisodeFormData
){}
