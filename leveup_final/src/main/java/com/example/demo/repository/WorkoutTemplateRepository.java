package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.demo.entity.WorkoutTemplate;

@Repository
public interface WorkoutTemplateRepository extends JpaRepository<WorkoutTemplate, Long> {
    List<WorkoutTemplate> findTop3ByGoal(String goal);
}