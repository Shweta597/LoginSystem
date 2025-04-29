package com.shwetashaw.login.service;

import com.shwetashaw.login.model.AppUser;
import com.shwetashaw.login.repository.UserRepository;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.shwetashaw.login.model.UserDetailsImp;

@Service
public class UserService implements UserDetailsService{

    @Autowired
    private UserRepository userRepository;
    private final PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();

   
    public String registerUser(AppUser user) {
        // Check if the email already exists
        if (isEmailRegistered(user.getEmail())) {
            return "Email is already registered. Please login.";
        }
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        userRepository.save(user);
        return "User registered successfully!";
    }

    public String loginUser(String email, String password) {
        AppUser user = userRepository.findByEmail(email);
        if (user != null && passwordEncoder.matches(password, user.getPassword())) {
            return "Login successful!";
        }
        return "Invalid email or password!";
    }

    public boolean isEmailRegistered(String email) {
        return userRepository.findByEmail(email) != null;
    }


    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        AppUser user = userRepository.findByEmail(email);

        if(user == null){
            System.out.println("User not found");
            throw new UsernameNotFoundException("User 404");

        }
        return new UserDetailsImp(user);


        
    }
}
