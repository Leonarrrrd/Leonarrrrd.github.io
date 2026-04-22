package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.WorkoutExercise;

public interface WorkoutExerciseRepository extends JpaRepository<WorkoutExercise, Long> {
    List<WorkoutExercise> findByPlanIdOrderByOrderIndexAsc(Long planId);
}