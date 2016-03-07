package com.app.service.impl;

import com.app.domain.Customer;
import com.app.repository.CustomerRepository;
import com.app.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by ruben on 4/03/16.
 */
@Service
public class CustomerServiceImpl implements CustomerService{

    @Autowired
    CustomerRepository repository;

    @Override
    public Iterable<Customer> findAll() {
        return repository.findAll();
    }
}
