package com.capgemini.controllers;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import com.capgemini.model.Booking;
import com.capgemini.model.Mens;
import com.capgemini.repositories.MensRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class MensController {

    @Autowired
    MensRepository mensRepository;

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

        this.mensRepository.save(mens);
        System.out.println("Created new mens: " + mens.getFirstName() + "" + mens.getLastName());
        return mens;

    }

    @RequestMapping(value = "/api/mensList", method = RequestMethod.POST)
    public Iterable<Mens> getMensList(@RequestBody Mens mens) {

        Iterable<Mens> mensen = this.mensRepository.findAll();

        return mensen;
    }

}