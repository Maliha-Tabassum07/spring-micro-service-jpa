package com.microservice.farmersservice.entity;


import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "farmer")
public class FarmerEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String number;

    @Transient
    private List<ProductEntity> productList;
    public FarmerEntity() {
    }

    public FarmerEntity(Integer id, String name, String number, List<ProductEntity> productList) {
        this.id = id;
        this.name = name;
        this.number = number;
        this.productList = productList;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public List<ProductEntity> getProductList() {
        return productList;
    }

    public void setProductList(List<ProductEntity> productList) {
        this.productList = productList;
    }
}