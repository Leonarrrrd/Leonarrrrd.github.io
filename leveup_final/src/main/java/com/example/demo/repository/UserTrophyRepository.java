package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.UserTrophy;

public interface UserTrophyRepository extends JpaRepository<UserTrophy, Long> {
    List<UserTrophy> findByUserId(Long userId);
    boolean existsByUserIdAndTrophyId(Long userId, Long trophyId);
}