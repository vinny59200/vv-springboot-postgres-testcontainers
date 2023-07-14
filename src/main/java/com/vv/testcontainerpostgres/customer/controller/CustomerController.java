package com.vv.testcontainerpostgres.customer.controller;

import com.vv.testcontainerpostgres.customer.model.Customer;
import com.vv.testcontainerpostgres.customer.repository.CustomerRepository;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping( "/customers" )
@AllArgsConstructor
@Slf4j
/**
 * https://testcontainers.com/
 * https://sl.bing.net/fT2eNQNbWEu
 * https://github.com/vinny59200/vv-springboot-postgre.git
 * https://testcontainers.com/guides/testing-spring-boot-rest-api-using-testcontainers/
 * https://www.reddit.com/r/java/comments/ywe76f/testcontainers_testing_with_real_dependencies/
 * https://www.reddit.com/r/java/comments/wg1fw0/integration_testing_for_spring_boot_with/
 * https://www.reddit.com/r/ExperiencedDevs/comments/14tfz8o/slow_running_integration_tests_in_cicd_pipeline/
 * https://www.udemy.com/course/spring-professional-certification-6-full-tests-2v0-7222-a/?referralCode=04B6ED315B27753236AC
 */ public class CustomerController {
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
        log.error( "VV add a customer:" + c );
        return c;
    }

}
