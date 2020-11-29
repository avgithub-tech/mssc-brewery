package com.springframework.msscbrewery.service;

import com.springframework.msscbrewery.web.model.BeerDto;
import com.springframework.msscbrewery.web.model.CustomerDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@Slf4j
public class CustomerServiceImpl implements CustomerService{
    @Override
    public CustomerDto getCustomerById(UUID id) {
        return CustomerDto.builder().id(UUID.randomUUID())
                .name("Amit Vaghela")
                .build();
    }

    @Override
    public void updateCustomer(UUID id, CustomerDto customerDto) {
        //update Customer for customerId
        log.debug("Customer updated for id: "+id);
    }

    @Override
    public void deleteCustomer(UUID id) {
        log.debug("Customer deleted for id: "+id);
    }

    @Override
    public CustomerDto saveCustomer(CustomerDto customerDto) {
        return CustomerDto.builder()
                .id(UUID.randomUUID())
                .build();
    }
}
