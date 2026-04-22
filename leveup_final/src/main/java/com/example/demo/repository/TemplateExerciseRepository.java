package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository; // 导入它

import com.example.demo.entity.TemplateExercise;

@Repository
public interface TemplateExerciseRepository extends JpaRepository<TemplateExercise, Long> {
    List<TemplateExercise> findByTemplateIdOrderByOrderIndexAsc(Long templateId);
}
