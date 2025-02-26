package com.strange_tape.project_maeva.model.webtoon.canvas;

import com.strange_tape.project_maeva.model.webtoon.element.CanvasElement;

import java.util.List;

// Layer is juste a canvas
public record Layer(
        String id,
        CanvasConfig canvasConfig,
        List<CanvasElement> content
) {
}
