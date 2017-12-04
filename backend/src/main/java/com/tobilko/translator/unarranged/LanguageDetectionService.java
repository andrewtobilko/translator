package com.tobilko.translator.unarranged;

import com.detectlanguage.DetectLanguage;
import com.detectlanguage.Result;
import lombok.SneakyThrows;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Andrew Tobilko on 12/4/17.
 */
@Service
public class LanguageDetectionService {

    public LanguageDetectionService() {
        DetectLanguage.apiKey = "7f16a7544395dd33f7cc52f23209f63d";
    }

    @SneakyThrows
    public List<Result> detectLanguagesByText(String text) {
        return DetectLanguage.detect(text);
    }

}
