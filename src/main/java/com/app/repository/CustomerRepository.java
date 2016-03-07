package com.app.repository;

import com.app.domain.Customer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by ruben on 4/03/16.
 */
@Repository
public interface CustomerRepository extends CrudRepository<Customer, Integer> {

    List<Customer> findByLastName(String lastName);
}
