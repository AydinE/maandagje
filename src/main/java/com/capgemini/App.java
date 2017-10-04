package com.capgemini;

import com.capgemini.controllers.DatabaseStuff;
import com.capgemini.controllers.EchtLeuk;
import com.capgemini.model.Mens;
import com.capgemini.repositories.MensRepository;
import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class App {

    public static void main(String[] args) throws Exception {

        SpringApplication.run(App.class, args);

//        DatabaseStuff db = new DatabaseStuff("capgemini-academy.ck17qz3qdemp.eu-west-1.rds.amazonaws.com", "hotel5", "capgemini", "hotel5");
//        db.open();
//        // 2
//        db.query("SELECT country FROM customers WHERE name=\"Sinterklaas\"");
//        // 3
//        db.query("SELECT COUNT(name) FROM customers");
//        // 4
//        db.query("SELECT COUNT(name) FROM customers WHERE country=\"sint maarten\" OR country=\"Nepal\"");
//        // 5
//        db.insertQuery("INSERT INTO customers(name, address, postal_code, city, country) VALUES (\"Juanita\", \"Mexstraat 233\", \"6555HJ\", \"Mexicostad\", \"Mexico\") ");
//        db.close();
    }

    @Bean
    public CommandLineRunner demo(MensRepository repository) {
        return (args) -> {
            // save a couple of customers
            repository.save(new Mens("Jack", "Bauer", 22));
            repository.save(new Mens("Chloe", "O'Brian", 14));
            repository.save(new Mens("Kim", "Bauer", 19));
            repository.save(new Mens("David", "Palmer", 45));
            repository.save(new Mens("Michelle", "Dessler", 68));

            // fetch all customers
            System.out.println("Customers found with findAll():");
            System.out.println("-------------------------------");
            for (Mens mens : repository.findAll()) {
                System.out.println(mens.getFirstName());
                System.out.println(mens.getLastName());
                System.out.println(mens.getAge());
            }
            System.out.println("");

//            // fetch an individual customer by ID
//            Customer customer = repository.findOne(1L);
//            log.info("Customer found with findOne(1L):");
//            log.info("--------------------------------");
//            log.info(customer.toString());
//            log.info("");
//
//            // fetch customers by last name
//            log.info("Customer found with findByLastName('Bauer'):");
//            log.info("--------------------------------------------");
//            for (Customer bauer : repository.findByLastName("Bauer")) {
//                log.info(bauer.toString());
//            }
//            log.info("");
        };
    }

}
