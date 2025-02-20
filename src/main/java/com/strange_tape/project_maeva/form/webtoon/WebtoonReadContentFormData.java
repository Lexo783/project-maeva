package com.strange_tape.project_maeva.form.webtoon;

import com.strange_tape.project_maeva.form.webtoon.canvas.Layer;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

public record WebtoonReadContentFormData(
        List<Layer> layers,
        List<MultipartFile> files
) {
}

