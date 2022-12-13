package org.sid.customerservice;

import org.sid.customerservice.entities.Customer;
import org.sid.customerservice.repository.CustomerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CustomerServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CustomerServiceApplication.class, args);
	}
	@Bean
CommandLineRunner start(CustomerRepository customerRepository)
{
	return args -> {
		customerRepository.save(new Customer(null,"Mohamed","simotaoussi80@gmail.com"));
		customerRepository.save(new Customer(null,"TAOUSSI","simotaoussi50@gmail.com"));
		customerRepository.save(new Customer(null,"taoussi","simotaoussi60@gmail.com"));
		customerRepository.findAll().forEach(customer -> {
			System.out.println(customer.toString());
		});
	};
}
}
