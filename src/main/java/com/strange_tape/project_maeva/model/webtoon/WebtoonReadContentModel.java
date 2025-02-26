package com.strange_tape.project_maeva.model.webtoon;

import com.strange_tape.project_maeva.model.webtoon.canvas.Layer;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

public record WebtoonReadContentModel(
        List<Layer> layers,
        List<MultipartFile> files
) {
}

