package br.com.web.foundation.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;

public interface ICRUDController<T> {

    Iterable<T> list();

    T getById(@PathVariable Integer id);

    ResponseEntity<T> add(T domainObject);

    ResponseEntity<T> update(Integer id, T domainObject);

    ResponseEntity<T> delete(Integer id);
}
