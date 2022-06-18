package com.amigoscode.customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories

public interface CustomerRepository extends JpaRepository<Customer, Integer>{

}
