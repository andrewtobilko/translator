package com.tobilko.translator.configuration;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Andrew Tobilko on 12/4/17.
 */
@Configuration
public class BeanConfiguration {

    @Bean(name = BeanName.OBJECT_MAPPER)
    public ObjectMapper getObjectMapper() {
        return new ObjectMapper();
    }

    @NoArgsConstructor(access = AccessLevel.PRIVATE)
    private final static class BeanName {

        public static final String TRANSLATE_SERVICE = "translateService";
        public static final String OBJECT_MAPPER = "mapper";

    }

}
