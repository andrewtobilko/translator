package com.tobilko.translator.response.repository;

import com.tobilko.translator.response.Response;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by Andrew Tobilko on 12/1/17.
 */
public interface ResponseRepository extends CrudRepository<Response, Long> {

    List<Response> findAllByAuthorId(Long authorId);

}
