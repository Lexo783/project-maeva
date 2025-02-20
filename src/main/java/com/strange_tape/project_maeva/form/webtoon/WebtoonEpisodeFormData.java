package com.strange_tape.project_maeva.form.webtoon;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;

public record WebtoonEpisodeFormData (
        @NotBlank(message = "Title is mandatory") String title,
        @NotBlank(message = "summary is mandatory") String summary,
        @Valid WebtoonReadContentFormData content
){}
