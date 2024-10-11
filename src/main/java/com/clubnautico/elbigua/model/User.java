package com.clubnautico.elbigua.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "user_number", unique = true, nullable = false)
    private String userNumber;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String lastname;

    @Column(unique = true, nullable = false)
    private String dni;

    @Column(nullable = false)
    private String phone;

    @Column(name = "emergency_contact", nullable = false)
    private String emergencyContact;

    @Column(name = "nautical_license", nullable = false)
    private String nauticalLicense;

    @Column
    private Date expiration;

    @Column
    private String observations;

    // Getters and setters
    // ...
}