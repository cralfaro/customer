package com.app.repository;

import com.app.domain.Orders;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by ruben on 4/03/16.
 */
@Repository
public interface OrderRepository extends CrudRepository<Orders, Integer> {

    List<Orders> findByName(String lastName);
}
