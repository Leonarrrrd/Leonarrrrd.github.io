package com.example.demo.repository;

import java.time.LocalDate;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.WorkoutPlan;

public interface WorkoutPlanRepository extends JpaRepository<WorkoutPlan, Long> {
    Optional<WorkoutPlan> findByUserIdAndPlanDate(Long userId, LocalDate planDate);

    long countByUserIdAndIsFinished(Long userId, boolean isFinished);

    long countByUserIdAndIsFinishedAndPlanDateBetween(Long userId, boolean isFinished, LocalDate start, LocalDate end);
}