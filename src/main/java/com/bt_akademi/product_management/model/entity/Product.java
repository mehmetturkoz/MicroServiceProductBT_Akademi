package com.bt_akademi.product_management.model.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@SequenceGenerator(name = "PRODUCTS_SEQUENCE", sequenceName = "PRODUCTS_SEQ",initialValue = 1,allocationSize = 1)
@Data
@Table(name = "PRODUCTS")
@Entity
public class Product
{
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "PRODUCTS_SEQUENCE")
    @Column(name = "PRODUCT_ID", nullable = false)
    @Id
    private Integer productID;

    @Column(length = 120, nullable = false)
    private String name;

    private String description;

    @Column(length = 80, nullable = false)
    private String category;

    @Column(nullable = false)
    private Double price;


    @Column(nullable = false)
    private Date created;
}

