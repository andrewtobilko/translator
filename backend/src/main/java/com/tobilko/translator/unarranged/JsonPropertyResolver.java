package com.tobilko.translator.unarranged;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import lombok.RequiredArgsConstructor;
import org.springframework.core.MethodParameter;
import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.http.server.ServletServerHttpRequest;
import org.springframework.web.bind.support.WebDataBinderFactory;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.method.support.ModelAndViewContainer;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by Andrew Tobilko on 12/4/17.
 */
@RequiredArgsConstructor
public class JsonPropertyResolver implements HandlerMethodArgumentResolver {

    private final ObjectMapper mapper;

    @Override
    public boolean supportsParameter(MethodParameter parameter) {
        return parameter.hasParameterAnnotation(JsonProperty.class);
    }

    @Override
    public Object resolveArgument(MethodParameter parameter, ModelAndViewContainer container, NativeWebRequest request,
                                  WebDataBinderFactory factory) throws Exception {
        final Class<?> parameterType = parameter.getParameterType();

        if (!String.class.equals(parameterType)) {
            throw new HttpMessageNotReadableException("Could not read document. Parameter type " + parameterType + " not parsable.");
        }

        final HttpServletRequest servletRequest = request.getNativeRequest(HttpServletRequest.class);
        final ServletServerHttpRequest message = new ServletServerHttpRequest(servletRequest);
        final MediaType mediaType = message.getHeaders().getContentType();

        if (!mediaType.equals(MediaType.APPLICATION_JSON_UTF8)) {
            throw new HttpMessageNotReadableException(
                    "Could not read document. Expected Content-Type " + MediaType.APPLICATION_JSON_UTF8 + ", was " + mediaType + ".");
        }

        final ObjectNode body = mapper.readValue(message.getBody(), ObjectNode.class);
        final JsonProperty annotation = parameter.getParameterAnnotation(JsonProperty.class);

        return body.get(annotation.value()).asText();
    }

}
