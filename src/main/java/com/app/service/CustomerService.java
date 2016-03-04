package com.app.service;

import com.app.persistence.Customer;

/**
 * Created by ruben on 4/03/16.
 */
public interface CustomerService {
    Iterable<Customer> findAll();
}
