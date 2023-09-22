package com.microservice.productservice.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "product")
public class ProductEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String quantity;
    private Integer price;
    private Integer farmerId;

    public ProductEntity() {
    }

    public ProductEntity(Integer id, String name, String quantity, Integer price, Integer farmerId) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.price = price;
        this.farmerId = farmerId;
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

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getFarmerId() {
        return farmerId;
    }

    public void setFarmerId(Integer farmerId) {
        this.farmerId = farmerId;
    }
}

