package com.example.project.repository;

import com.example.project.entity.authEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface authRepository extends JpaRepository<authEntity, Long> {
    authEntity findByUsername(String username);
}
