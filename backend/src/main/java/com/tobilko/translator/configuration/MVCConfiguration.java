package com.tobilko.translator.configuration;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.tobilko.translator.unarranged.JsonPropertyResolver;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import java.util.List;

/**
 * Created by Andrew Tobilko on 12/4/17.
 */
@Configuration
@RequiredArgsConstructor
public class MVCConfiguration extends WebMvcConfigurerAdapter {

    private final ObjectMapper mapper;

    @Override
    public void addArgumentResolvers(List<HandlerMethodArgumentResolver> resolvers) {
        resolvers.add(new JsonPropertyResolver(mapper));
    }

}
