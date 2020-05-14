package com.jrbrayjr.sample.genomeanalyzer.controller;

import com.jrbrayjr.sample.genomeanalyzer.model.User;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RegistrationController {

    @PostMapping( value = "/user", consumes = MediaType.APPLICATION_JSON_VALUE )
    public ResponseEntity<String> user(@RequestBody User user) {
        ResponseEntity<String> response = ResponseEntity.accepted().build();
        return response;
    }
}
