package com.strange_tape.project_maeva.model.webtoon;

import jakarta.validation.constraints.NotBlank;

public record WebtoonPageModel(
        @NotBlank(message = "pageLinkToEpisode is mandatory") String pageLinkToEpisode,
        String pagePath
) {
}
