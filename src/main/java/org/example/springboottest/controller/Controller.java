package org.example.springboottest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/restapi")
    public String mainListener() {
        return "Add something there";
    }
}
