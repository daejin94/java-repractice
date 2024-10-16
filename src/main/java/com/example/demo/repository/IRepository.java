package com.example.demo.repository;

import com.example.demo.model.Human;
import java.util.List;
import java.util.Optional;

public interface IRepository<T extends Human, ID> {

    ID create(T entity);
    Optional<T> read(ID id);
    List<T> read();
    ID update(T entity);
    void delete(T entity);


}
