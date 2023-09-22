package com.microservice.farmersservice.repository;

import com.microservice.farmersservice.entity.FarmerEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FarmerRepository extends JpaRepository<FarmerEntity,Integer> {
}
