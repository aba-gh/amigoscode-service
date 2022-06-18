package com.amigoscode.customer;

import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;


@Service
@Repository
@EnableJpaRepositories

public record CustomerService(CustomerRepository customerRepository) {
    public void registerCustomer(CustomerRegistrationRequest request) {
        Customer customer = Customer.builder()
                .firstName(request.firstName())
                .lastName(request.lastName())
                .email(request.email())
                .build();

        customerRepository.saveAndFlush(customer);
    }
}
