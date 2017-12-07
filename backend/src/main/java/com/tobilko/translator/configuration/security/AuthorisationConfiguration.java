package com.tobilko.translator.configuration.security;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.oauth2.config.annotation.configurers.ClientDetailsServiceConfigurer;
import org.springframework.security.oauth2.config.annotation.web.configuration.AuthorizationServerConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;
import org.springframework.security.oauth2.config.annotation.web.configurers.AuthorizationServerEndpointsConfigurer;
import org.springframework.security.oauth2.provider.token.TokenEnhancerChain;
import org.springframework.security.oauth2.provider.token.TokenStore;
import org.springframework.security.oauth2.provider.token.store.JwtAccessTokenConverter;

import java.util.Collections;

/**
 * Created by Andrew Tobilko on 12/8/17.
 */
@Configuration
@RequiredArgsConstructor
@EnableAuthorizationServer
public class AuthorisationConfiguration extends AuthorizationServerConfigurerAdapter {

    @Value("${spring.security.jwt.client-id}")
    private String clientId;

    @Value("${spring.security.jwt.client-secret}")
    private String clientSecret;

    @Value("${spring.security.jwt.grant-type}")
    private String grantType;

    @Value("${spring.security.jwt.scopes}")
    private String[] scopes;

    @Value("${spring.security.jwt.resource-ids}")
    private String resourceIds;

    private final TokenStore tokenStore;
    private final JwtAccessTokenConverter jwtAccessTokenConverter;
    private final AuthenticationManager authenticationManager;

    @Override
    public void configure(ClientDetailsServiceConfigurer configurer) throws Exception {
        configurer
                .inMemory()
                .withClient(clientId)
                .secret(clientSecret)
                .authorizedGrantTypes(grantType)
                .scopes(scopes)
                .resourceIds(resourceIds);
    }

    @Override
    public void configure(AuthorizationServerEndpointsConfigurer configurer) {
        final TokenEnhancerChain chain = new TokenEnhancerChain();

        chain.setTokenEnhancers(Collections.singletonList(jwtAccessTokenConverter));
        configurer.tokenStore(tokenStore)
                .accessTokenConverter(jwtAccessTokenConverter)
                .tokenEnhancer(chain)
                .authenticationManager(authenticationManager);
    }

}
