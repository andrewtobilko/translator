package com.tobilko.translator.configuration;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.cloud.translate.Translate;
import com.google.cloud.translate.TranslateOptions;
import com.tobilko.translator.unarranged.JsonPropertyResolver;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Andrew Tobilko on 12/4/17.
 */
@Configuration
public class BeanConfiguration {

    @Bean
    public Translate getGoogleTranslateService() {
        return TranslateOptions.getDefaultInstance().getService();
    }

    @Bean("mapper")
    public ObjectMapper getObjectMapper() {
        return new ObjectMapper();
    }

    @Bean
    public JsonPropertyResolver getJsonPropertyResolver(ObjectMapper mapper) {
        return new JsonPropertyResolver(mapper);
    }

}
