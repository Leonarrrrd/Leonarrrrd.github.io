package com.example.demo.repository;

import com.example.demo.entity.WeightLog;
import org.springframework.data.jpa.repository.JpaRepository;
import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

public interface WeightLogRepository extends JpaRepository<WeightLog, Long> {
    List<WeightLog> findByUserIdAndDateBetweenOrderByDateAsc(Long userId, LocalDate start, LocalDate end);
    Optional<WeightLog> findByUserIdAndDate(Long userId, LocalDate date);
    List<WeightLog> findAllByUserIdOrderByDateAsc(Long userId);
}