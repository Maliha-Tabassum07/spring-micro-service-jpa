package com.microservice.customerservice.service;

import com.microservice.customerservice.entity.CustomerEntity;
import com.microservice.customerservice.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {
    @Autowired
    private CustomerRepository customerRepository;

    public CustomerEntity createCustomer(CustomerEntity customerEntity){
        return customerRepository.save(customerEntity);
    }
    public CustomerEntity getCustomerById(Integer id){
        return customerRepository.findById(id).orElseThrow(()->new NullPointerException("Id not available"));
    }
    public List<CustomerEntity> getCustomer(){
        return customerRepository.findAll();
    }

}
