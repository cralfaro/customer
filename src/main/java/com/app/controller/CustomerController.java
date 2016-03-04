package com.app.controller;

import com.app.persistence.Customer;
import com.app.persistence.Orders;
import com.app.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CustomerController {

    @Autowired
    CustomerService customerService;

    @RequestMapping("/customers")
    public ModelAndView greeting() {
        ModelAndView mav = new ModelAndView("customers");
        Iterable<Customer> customers = customerService.findAll();
        mav.addObject("list", customers);
        return mav;
    }

}
