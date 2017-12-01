package com.tobilko.translator.account;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by Andrew Tobilko on 11/28/17.
 */
@Entity
public class Account {

    @Id
    @GeneratedValue
    private Long id;
    private final String email;
    private final String password;

    public Account(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public Long getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

}
