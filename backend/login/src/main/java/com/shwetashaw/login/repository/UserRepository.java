package com.shwetashaw.login.repository;

import com.shwetashaw.login.model.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository extends JpaRepository<AppUser, String> {
    AppUser findByEmail(String email);
}
