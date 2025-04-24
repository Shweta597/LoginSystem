package com.shwetashaw.login.model;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class AppUser {
    
    @Id
    private String email;
    private String name;
    private String password;
}
