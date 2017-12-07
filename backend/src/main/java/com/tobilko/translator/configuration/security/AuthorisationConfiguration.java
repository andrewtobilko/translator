package com.tobilko.translator.configuration.security;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.oauth2.config.annotation.web.configuration.AuthorizationServerConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;

/**
 * Created by Andrew Tobilko on 12/8/17.
 */
@Configuration
@EnableAuthorizationServer
public class AuthorisationConfiguration extends AuthorizationServerConfigurerAdapter {



}
