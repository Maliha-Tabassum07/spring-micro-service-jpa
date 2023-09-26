package com.microservice.customerservice.entity;

import java.time.LocalDate;
import java.util.UUID;

public class OrderEntity {
    private UUID id;
    private LocalDate deliveryDate;
    private String address;
    private Integer customerId;
    private Integer productId;

    public OrderEntity() {
    }

    public OrderEntity(UUID id, LocalDate deliveryDate, String address, Integer customerId, Integer productId) {
        this.id = id;
        this.deliveryDate = deliveryDate;
        this.address = address;
        this.customerId = customerId;
        this.productId = productId;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public LocalDate getDeliveryDate() {
        return deliveryDate;
    }

    public void setDeliveryDate(LocalDate deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }
}
