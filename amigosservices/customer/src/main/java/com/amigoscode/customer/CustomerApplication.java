package com.amigoscode.customer;
import com.amigoscode.customer.CustomerRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;

@SpringBootApplication
@Service

public class CustomerApplication {
    public static void main(String[] args){
        SpringApplication.run(CustomerApplication.class, args);
    }
}
