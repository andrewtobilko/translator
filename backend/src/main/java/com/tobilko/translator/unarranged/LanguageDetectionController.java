package com.tobilko.translator.unarranged;

import com.google.common.collect.ImmutableMap;
import org.codehaus.jackson.annotate.JsonProperty;
import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.Map;

/**
 * Created by Andrew Tobilko on 12/4/17.
 */
@RestController
public class LanguageDetectionController {

    private final LanguageDetectionService service;

    public LanguageDetectionController(LanguageDetectionService service) {
        this.service = service;
    }

    @ResponseStatus(code = HttpStatus.OK)
    @PostMapping(path = "/api/detect-language", consumes = "application/json", produces = "application/json")
    public Map<String, String> detectLanguageByText(@JsonProperty final String text) {
        final String language = service.detectLanguageByText(text).orElse("unknown");
        return ImmutableMap.of("language", language);
    }

}