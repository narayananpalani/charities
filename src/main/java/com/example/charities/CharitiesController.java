package com.example.charities;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CharitiesController {

    @Autowired
    private CharityRepository repository;

    @GetMapping("/charities")
    List<Charity> all() {
        return repository.findAll();
    }
}
