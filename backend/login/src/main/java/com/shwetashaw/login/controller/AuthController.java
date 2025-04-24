package com.shwetashaw.login.controller;

import com.shwetashaw.login.model.AppUser;
import com.shwetashaw.login.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.HttpStatus;


@RestController
@RequestMapping
@CrossOrigin(origins="http://localhost:3000/")
public class AuthController {

    @Autowired
    private UserService userService;

    @PostMapping("/register")
    public ResponseEntity<?> registerUser(@RequestBody AppUser user) {
        String result = userService.registerUser(user);

        if (result.equals("Email is already registered. Please login.")) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST)
                                .body(result);
        }

        return ResponseEntity.status(HttpStatus.CREATED)
                            .body(result);
    }
       
    @PostMapping("/login")
    public ResponseEntity<String> login(@RequestBody AppUser user) {
        String result = userService.loginUser(user.getEmail(), user.getPassword());

        if (result.equals("Login successful!")) {
            return ResponseEntity.ok(result);
        } else {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(result);
        }
    }
}
