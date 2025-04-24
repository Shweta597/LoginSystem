// src/main/java/com/shwetashaw/login/controller/HelloController.java
package com.shwetashaw.login.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins="http://localhost:3000/")
public class HomeController {

    @GetMapping("/")
    public String sayHello() {
        return "Welcome to our application!";
    }
}
