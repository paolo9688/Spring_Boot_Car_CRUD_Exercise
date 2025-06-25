package com.example.car_crud_exercise.repository;

import com.example.car_crud_exercise.entity.Car;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarRepository extends JpaRepository<Car, Long> {

}
