package com.strange_tape.project_maeva.form.webtoon;

import jakarta.validation.constraints.NotBlank;

public record WebtoonPageFormData(
        @NotBlank(message = "pageLinkToEpisode is mandatory") String pageLinkToEpisode,
        String pagePath
) {
}
