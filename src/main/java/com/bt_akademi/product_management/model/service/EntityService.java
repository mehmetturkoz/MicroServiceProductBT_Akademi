package com.bt_akademi.product_management.model.service;

import java.util.List;

public interface EntityService<E, I> {

    List<E> getAll();

    //id ye göre bul
    E findByID(I id);

    E save(E entity);

    void deleteById(I id);

}
