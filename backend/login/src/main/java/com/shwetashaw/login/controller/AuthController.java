package com.shwetashaw.login.controller;

import com.shwetashaw.login.model.AppUser;
import com.shwetashaw.login.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
@CrossOrigin(origins="http://localhost:3000/")
public class AuthController {

    @Autowired
    private UserService userService;

    @PostMapping("/register")
    public ResponseEntity<String> register(@RequestBody AppUser user) {
        userService.registerUser(user);
        return ResponseEntity.ok("User registered successfully!");
    }
}
