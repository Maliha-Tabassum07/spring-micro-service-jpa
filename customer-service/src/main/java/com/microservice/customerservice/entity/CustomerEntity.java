package com.microservice.customerservice.entity;


import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "customer")
public class CustomerEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String number;

    @Transient
    private List<OrderEntity> orderEntityList;

    public CustomerEntity() {
    }

    public CustomerEntity(Integer id, String name, String number, List<OrderEntity> orderEntityList) {
        this.id = id;
        this.name = name;
        this.number = number;
        this.orderEntityList = orderEntityList;
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

    public List<OrderEntity> getOrderEntityList() {
        return orderEntityList;
    }

    public void setOrderEntityList(List<OrderEntity> orderEntityList) {
        this.orderEntityList = orderEntityList;
    }
}
