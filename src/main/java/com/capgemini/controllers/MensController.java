package com.capgemini.controllers;

import java.util.concurrent.atomic.AtomicLong;

import com.capgemini.model.Mens;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class MensController {

    //http://localhost:8080/mens?firstName=Johan&lastName=DeVries&age=22
    @RequestMapping("/api/mens")
    public Mens mens(@RequestParam(value="firstName", defaultValue="Peter") String firstName, @RequestParam(value="lastName", defaultValue="Pan") String lastName, @RequestParam(value="age", defaultValue="10") int age) {
        return new Mens(firstName, lastName, age);
    }

    @RequestMapping(value = "/api/mensje", method = RequestMethod.POST)
    public ResponseEntity<Mens> create(@RequestBody Mens mens) {

        // TODO: call persistence layer to update
        return new ResponseEntity<Mens>(mens, HttpStatus.OK);
    }

    @RequestMapping(value = "/api/mens", method = RequestMethod.POST)
    public Mens addMens(@RequestBody Mens mens) {

        System.out.println("Created new mens: " + mens.getFirstName());
        return mens;
    }

}