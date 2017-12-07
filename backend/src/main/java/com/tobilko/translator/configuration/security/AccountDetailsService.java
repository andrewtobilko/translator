package com.tobilko.translator.configuration.security;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import java.util.Collections;

/**
 * Created by Andrew Tobilko on 12/8/17.
 */
public class AccountDetailsService implements UserDetailsService {

    @Override
    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
        // TODO: 12/8/17 write sth reasonable
        return new User(userName, "password", Collections.emptyList());
    }

}
