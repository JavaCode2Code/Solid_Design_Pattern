package com.scjp.segregation.service;

import java.util.List;

import com.scjp.segregation.Entity;

public interface PersistanceService<T extends Entity> {
public void save(T entity);
public void delete(T entity);
public T findById(Long id);
public List<T> findByName(String name);
}
