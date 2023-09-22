package com.microservice.productservice.controller;

import com.microservice.productservice.entity.ProductEntity;
import com.microservice.productservice.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {
    @Autowired
    ProductService productService;

    @PostMapping("/add")
    public ProductEntity add(@RequestBody ProductEntity productEntity) {
        return productService.createProduct(productEntity);
    }

    @GetMapping("/all")
    public List<ProductEntity> findAll() {
        return productService.getProduct();
    }

    @GetMapping("/{id}")
    public ProductEntity findById(@PathVariable Integer id) {
        return productService.getProductById(id);
    }

    @GetMapping("/farmer/{farmerId}")
    public List<ProductEntity> findByFarmer(@PathVariable Integer farmerId) {
        return productService.findByFarmer(farmerId);
    }
}
