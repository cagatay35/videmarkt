package com.mkk;

import com.mkk.data.entity.Customer;
import com.mkk.data.repository.ICustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;

/**
 * Hello world!
 *
 */

@Configuration
@EnableAutoConfiguration
@EntityScan("com.mkk.data.entity")
@EnableJpaRepositories(basePackages = {"com.mkk.data.repository"})
@SpringBootApplication(scanBasePackages = "com.mkk")
public class App extends SpringBootServletInitializer {

    @Autowired
    ICustomerRepository customerRepository;

    public static void main(String[] args) {

        SpringApplication.run(App.class, args);
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        createTestData();
        return super.configure(builder);
    }

    @Transactional
    public void createTestData() {
        Customer customer = new Customer();
        customer.setName("Çağatay");
        customer.setSurname("Gökçel");
        customer.setEmail("cagataygokcel@gmail.com");
        customer.setMemberDate(new Date());
        customerRepository.save(customer);

        Customer customer2 = new Customer();
        customer2.setName("Basak");
        customer2.setSurname("Yuksel");
        customer2.setEmail("basakyuksel@gmail.com");
        customer2.setMemberDate(new Date());
        customerRepository.save(customer2);
    }
}