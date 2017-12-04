package com.tobilko.translator.unarranged;

import com.google.cloud.translate.Detection;
import com.google.cloud.translate.Translate;
import com.google.common.collect.ImmutableList;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

import static java.util.Comparator.comparingDouble;

/**
 *
 * https://cloud.google.com/docs/authentication/getting-started
 *
 * Created by Andrew Tobilko on 12/4/17.
 */
@Service
public class LanguageDetectionService {

    private final Translate translateService;

    public LanguageDetectionService(Translate service) {
        translateService = service;
    }

    public Optional<String> detectLanguageByText(String text) {
        List<Detection> detections = translateService.detect(ImmutableList.of(text));

        if (detections == null || !detections.isEmpty()) {
            return Optional.empty();
        }

        return detections
                .stream()
                .max(comparingDouble(Detection::getConfidence))
                .map(Detection::getLanguage);
    }

}
