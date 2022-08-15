package com.raiseup.validateCRUD.data;


import com.raiseup.validateCRUD.bussines.model.Person;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

public interface CRUDRepository<T> {


    List<T> findAll();
    List<T> findAll(Sort sort);
    Page<T> findAll(Pageable pageable);
    List<T> findAllById(Iterable<Long> longs);
    long count();
    void deleteById(Long aLong);
    void delete(Person entity);
    void deleteAllById(Iterable<? extends Long> longs);
    void deleteAll(Iterable<? extends T> entities);
    void deleteAll();
    <S extends T> S save(S entity);
    <S extends T> List<S> saveAll(Iterable<S> entities);
    Optional<T> findById(Long aLong);
    boolean existsById(Long aLong);
    void flush();
    <S extends Person> S saveAndFlush(S entity);
    <S extends Person> List<S> saveAllAndFlush(Iterable<S> entities);
    void deleteAllInBatch(Iterable<Person> entities);
    void deleteAllByIdInBatch(Iterable<Long> longs);
    void deleteAllInBatch();
    T getOne(Long aLong);
    T getById(Long aLong);
    T getReferenceById(Long aLong);
    <S extends T> Optional<S> findOne(Example<S> example);
    <S extends T> List<S> findAll(Example<S> example);
    <S extends T> List<S> findAll(Example<S> example, Sort sort);
    <S extends T> Page<S> findAll(Example<S> example, Pageable pageable);
    <S extends T> long count(Example<S> example);
    <S extends T> boolean exists(Example<S> example);
    <S extends T, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction);
}
