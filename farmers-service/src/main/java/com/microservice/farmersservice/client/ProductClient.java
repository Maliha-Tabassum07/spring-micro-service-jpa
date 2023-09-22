package com.microservice.farmersservice.client;


import com.microservice.farmersservice.entity.ProductEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.service.annotation.GetExchange;
import org.springframework.web.service.annotation.HttpExchange;

import java.util.List;

@HttpExchange
public interface ProductClient {
    @GetExchange("product/farmer/{farmerId}")
    public List<ProductEntity> findByFarmer(@PathVariable Integer farmerId);
}
