package com.strange_tape.project_maeva.form.webtoon;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;

public record WebtoonSerieFormData(
        @NotBlank(message = "Title is mandatory") String title,
        @NotBlank(message = "summary is mandatory") String summary,
        @Valid WebtoonEpisodeFormData webtoonEpisodeFormData
){}
