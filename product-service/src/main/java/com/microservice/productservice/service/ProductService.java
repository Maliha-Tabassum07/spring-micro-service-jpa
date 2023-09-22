package com.microservice.productservice.service;

import com.microservice.productservice.entity.ProductEntity;
import com.microservice.productservice.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;

    public ProductEntity createProduct(ProductEntity productEntity) {
        return productRepository.save(productEntity);
    }

    public ProductEntity getProductById(Integer id) {
        return productRepository.findById(id).orElseThrow(()->new NullPointerException("Id not available"));
    }

    public List<ProductEntity> getProduct() {
        return productRepository.findAll();
    }

    public List<ProductEntity> findByFarmer(Integer farmerId) {
        return productRepository.findAllByFarmerId(farmerId).orElseThrow(()->new NullPointerException("Id not available"));
    }
}
