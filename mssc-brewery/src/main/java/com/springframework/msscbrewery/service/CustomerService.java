package com.springframework.msscbrewery.service;

import com.springframework.msscbrewery.web.model.CustomerDto;

import java.util.UUID;

public interface CustomerService {
    CustomerDto getCustomerById(UUID id);

    void updateCustomer(UUID id, CustomerDto customerDto);

    void deleteCustomer(UUID id);

    CustomerDto saveCustomer(CustomerDto customerDto);
}
