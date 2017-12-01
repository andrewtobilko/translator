package com.tobilko.translator.request.repository;

import com.tobilko.translator.request.Request;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by Andrew Tobilko on 12/1/17.
 */
public interface RequestRepository extends CrudRepository<Request, Long> {

    List<Request> findAllByAuthorId(Long authorId);

}
