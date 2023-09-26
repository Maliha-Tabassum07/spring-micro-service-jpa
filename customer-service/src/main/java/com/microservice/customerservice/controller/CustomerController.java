package com.microservice.customerservice.controller;


import com.microservice.customerservice.entity.CustomerEntity;
import com.microservice.customerservice.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/farmer")
public class CustomerController {
    @Autowired
    CustomerService customerService;

//    @Autowired
//    ProductClient productClient;

    @PostMapping("/add")
    public CustomerEntity add(@RequestBody CustomerEntity customerEntity) {
        return customerService.createCustomer(customerEntity);
    }

    @GetMapping("/all")
    public List<CustomerEntity> findAll() {
        return customerService.getCustomer();
    }

    @GetMapping("/{id}")
    public CustomerEntity findById(@PathVariable Integer id) {
        return customerService.getCustomerById(id);
    }
//    @GetMapping("/with-orders")
//    public List<CustomerEntity> findAllWithOrders() {
//        List<CustomerEntity> farmers
//                = farmerService.getFarmer();
//        farmers.forEach(farmer ->
//                farmer.setProductList(
//                        productClient.findByFarmer(farmer.getId())));
//        return farmers;
//    }
}
