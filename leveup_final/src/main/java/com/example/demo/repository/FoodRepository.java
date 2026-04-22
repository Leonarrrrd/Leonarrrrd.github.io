package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Food;

public interface FoodRepository extends JpaRepository<Food, Long> {
    List<Food> findByCategoryAndTargetIn(String category, List<String> targets);
}