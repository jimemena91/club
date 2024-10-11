package com.clubnautico.elbigua.model;

import javax.persistence.*;

@Entity
@Table(name = "cars")
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @Column(nullable = false)
    private String plate;

    @Column(name = "car_brand", nullable = false)
    private String carBrand;

    @Column(nullable = false)
    private String model;

    @Column(name = "car_color", nullable = false)
    private String carColor;

    @Column(name = "info_car")
    private String infoCar;

    // Getters and setters
    // ...
}