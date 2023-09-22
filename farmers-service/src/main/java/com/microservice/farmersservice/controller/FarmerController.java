package com.microservice.farmersservice.controller;

import com.microservice.farmersservice.client.ProductClient;
import com.microservice.farmersservice.entity.FarmerEntity;
import com.microservice.farmersservice.service.FarmerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/farmer")
public class FarmerController {
    @Autowired
    FarmerService farmerService;

    @Autowired
    ProductClient productClient;

    @PostMapping("/add")
    public FarmerEntity add(@RequestBody FarmerEntity farmerEntity) {
        return farmerService.createFarmer(farmerEntity);
    }

    @GetMapping("/all")
    public List<FarmerEntity> findAll() {
        return farmerService.getFarmer();
    }

    @GetMapping("/{id}")
    public FarmerEntity findById(@PathVariable Integer id) {
        return farmerService.getFarmerById(id);
    }
    @GetMapping("/with-products")
    public List<FarmerEntity> findAllWithStudent() {
        List<FarmerEntity> farmers
                = farmerService.getFarmer();
        farmers.forEach(farmer ->
                farmer.setProductList(
                        productClient.findByFarmer(farmer.getId())));
        return farmers;
    }
}
