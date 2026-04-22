package com.example.demo.repository;

import com.example.demo.entity.Exercise;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import java.util.List;

public interface ExerciseRepository extends JpaRepository<Exercise, Long> {
    List<Exercise> findByMuscleGroupOrderByName(String muscleGroup);

    @Query("SELECT DISTINCT e.muscleGroup FROM Exercise e")
    List<String> findAllMuscleGroups();
}