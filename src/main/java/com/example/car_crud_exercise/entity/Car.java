package com.example.car_crud_exercise.entity;

import com.example.car_crud_exercise.entity.enums.CarColor;
import com.example.car_crud_exercise.entity.enums.CarType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String modelName;

    private CarType type;

    private CarColor color;
}
