package com.brunosalata.digital_bank_api.service;

import java.util.List;

/**
 * @author Bruno Salata Lima
 * github.com/Brunosalata
 */

public interface CrudService<ID, T> {
    List<T> findAll();
    T findById(ID id);
    T create(T entity);
    T update(ID id, T entity);
    void delete(ID id);
}
