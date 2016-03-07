package com.app.loader;

import com.app.domain.Customer;
import com.app.domain.Orders;
import com.app.repository.CustomerRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ruben on 4/03/16.
 */
@Component
public class ApplicationLoader implements ApplicationListener<ContextRefreshedEvent> {

    private static final Logger log = LoggerFactory.getLogger(ApplicationLoader.class);

    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {

        Customer customer = new Customer("Ruben", "Alfaro");
        Orders order1 = new Orders("Order for Ruben 1");
        Orders order2 = new Orders("Order for Ruben 2");
        order1.setCustomer(customer);
        order2.setCustomer(customer);

        List<Orders> ordersList = new ArrayList<>();
        ordersList.add(order1);
        ordersList.add(order2);
        customer.setOrders(ordersList);
        customerRepository.save(customer);

        customer = new Customer("Dieguito", "Peña Bartolome");
        order1 = new Orders("Order for Dieguito 1");
        order2 = new Orders("Order for Dieguito 2");
        order1.setCustomer(customer);
        order2.setCustomer(customer);

        ordersList = new ArrayList<>();
        ordersList.add(order1);
        ordersList.add(order2);
        customer.setOrders(ordersList);
        customerRepository.save(customer);

        customer = new Customer("Sabri", "Cotta");
        order1 = new Orders("Order for Sabri 1");
        order2 = new Orders("Order for Sabri 2");
        order1.setCustomer(customer);
        order2.setCustomer(customer);

        ordersList = new ArrayList<>();
        ordersList.add(order1);
        ordersList.add(order2);
        customer.setOrders(ordersList);
        customerRepository.save(customer);

    }
}
