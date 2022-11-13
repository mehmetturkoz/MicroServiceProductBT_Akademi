package com.bt_akademi.product_management.model.repository;

import com.bt_akademi.product_management.model.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;


import java.util.List;


public interface ProductRepository extends JpaRepository<Product,Integer> {

    //SELECT * FROM PRODUCTS WHERE PRİCE>?;
    //SELECT * FROM PRODUCTS WHERE PRİCE>=?;


    List<Product> findAllByPriceGreaterThan(Double price);

    List<Product> findAllByPriceGreaterThanEqual(Double price);
}
