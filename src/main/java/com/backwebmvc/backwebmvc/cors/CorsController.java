package com.backwebmvc.backwebmvc.cors;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

//@CrossOrigin(origins = "http://localhost:8081")
public class CorsController {

    @CrossOrigin(origins = "http://localhost:8081")
    @GetMapping("/hello")
    public String hello(){
        return "Hello";
    }
}
