package com.microservice.farmersservice.service;

import com.microservice.farmersservice.entity.FarmerEntity;
import com.microservice.farmersservice.repository.FarmerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FarmerService {
    @Autowired
    private FarmerRepository farmerRepository;

    public FarmerEntity createFarmer(FarmerEntity farmerEntity){
        return farmerRepository.save(farmerEntity);
    }
    public FarmerEntity getFarmerById(Integer id){
        return farmerRepository.findById(id).orElseThrow(()->new NullPointerException("Id not available"));
    }
    public List<FarmerEntity> getFarmer(){
        return farmerRepository.findAll();
    }

}
