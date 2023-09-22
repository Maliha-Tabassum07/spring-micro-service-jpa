package com.microservice.productservice.repository;

import com.microservice.productservice.entity.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ProductRepository extends JpaRepository<ProductEntity,Integer> {
    Optional<List<ProductEntity>> findAllByFarmerId(Integer id);

}
