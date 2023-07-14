package com.vv.testcontainerpostgres.customer.controller;

import com.vv.testcontainerpostgres.customer.model.Customer;
import com.vv.testcontainerpostgres.customer.repository.CustomerRepository;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping( "/customers" )
@AllArgsConstructor
@Slf4j
public class CustomerController {
    private final CustomerRepository customerRepository;

    @GetMapping( "/{name}" )
    public List<Customer> getCustomersByName( @PathVariable String name ) {
        log.error( "VV  name:" + name );
        var customers = customerRepository.findByName( name );
        log.error( "VV customers:" + customers );
        return customers;
    }

    @GetMapping()
    public List<Customer> getCustomers() {
        log.error( "VV  find all" );
        var customers = customerRepository.findAll();
        log.error( "VV customers:" + customers );
        return customers;
    }

    @PostMapping( "/" )
    public Customer addCustomer( @RequestBody Customer cust ) {
        log.error( "VV add a customer:" + cust.toString() );
        Customer c = customerRepository.save( cust );
        log.error( "VV add a customer:" + c.toString() );
        return c;
    }

}
