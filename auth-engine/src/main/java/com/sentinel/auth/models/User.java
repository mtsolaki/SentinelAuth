package com.sentinel.auth.models;

import jakarta.persistence.*;
import lombok.*;

import java.util.UUID;

// User class
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID) // preferred than ID for security
    private UUID id;

    @Column(nullable = false, unique = true)
    private String email;

    //It stores the hashed password
    @Column(nullable = false)
    private String password;

    // Variable for active or inactive user
    @Column(nullable = false)
    private boolean enabled = true;

}
