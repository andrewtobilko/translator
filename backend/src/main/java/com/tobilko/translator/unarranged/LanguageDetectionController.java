package com.tobilko.translator.unarranged;

import com.detectlanguage.Result;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static org.springframework.http.MediaType.APPLICATION_JSON_UTF8_VALUE;

/**
 * Created by Andrew Tobilko on 12/4/17.
 */
@RestController
@RequiredArgsConstructor
public class LanguageDetectionController {

    private final LanguageDetectionService service;

    @ResponseStatus(code = HttpStatus.OK)
    @PostMapping(
            path = "/api/detect-language",
            consumes = APPLICATION_JSON_UTF8_VALUE,
            produces = APPLICATION_JSON_UTF8_VALUE
    )
    public List<Result> detectLanguagesByText(@JsonProperty("text") final String text) {
        return service.detectLanguagesByText(text);
    }

}