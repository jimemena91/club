package com.clubnautico.elbigua.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "ships")
public class Ship {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @Column(name = "registration_number", unique = true, nullable = false)
    private String registrationNumber;

    @Column(name = "due_date", nullable = false)
    private Date dueDate;

    @Column(nullable = false)
    private String type;

    @Column(nullable = false)
    private String color;

    @Column(nullable = false)
    private int capacity;

    @Column(nullable = false)
    private String brand;

    @Column
    private Integer hp;

    @Column(name = "fantasy_name", nullable = false)
    private String fantasyName;

    @Column(nullable = false)
    private String insurer;

    @Column(name = "due_date_insurance", nullable = false)
    private Date dueDateInsurance;

    @Column
    private String info;

    // Getters and setters
    // ...
}