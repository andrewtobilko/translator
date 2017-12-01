package com.tobilko.translator.request;

import com.tobilko.translator.account.Account;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDateTime;

/**
 * Created by Andrew Tobilko on 12/1/17.
 */
@Entity
public class Request {

    @Id
    @GeneratedValue
    private Long id;

    private Account author;
    private LocalDateTime publicationDateTime;

}
