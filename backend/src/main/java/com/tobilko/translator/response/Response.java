package com.tobilko.translator.response;

import com.tobilko.translator.account.Account;
import com.tobilko.translator.request.Request;

import javax.persistence.*;
import java.time.LocalDateTime;

/**
 * Created by Andrew Tobilko on 12/1/17.
 */
@Entity
public final class Response {

    @Id
    @GeneratedValue
    private Long id;

    @ManyToOne
    private Account author;

    @OneToOne
    private Request to;
    private LocalDateTime publicationDateTime;

}
