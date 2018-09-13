package com.example.demo.controller;

import com.example.demo.entity.A;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
public class MyController {

    @PostMapping(value = "/demo", consumes = MediaType.APPLICATION_JSON_VALUE)
    public String demo(@RequestBody A data) {
        // error
        return "";
    }
}
