package com.strange_tape.project_maeva.model.webtoon.canvas;

public record CanvasConfig (
        int width,
        int height,
        boolean locked,
        boolean isDefault,
        boolean isBackground,
        CanvasType category
) {
}
