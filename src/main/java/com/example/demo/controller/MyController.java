package com.example.demo.controller;

import com.example.demo.entity.A;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
public class MyController {

    @PostMapping(value = "/demo", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> demo(@RequestBody A data) throws JsonProcessingException {
        return new ResponseEntity<>(new ObjectMapper().writeValueAsString(data), new HttpHeaders(), HttpStatus.OK);
    }
}
