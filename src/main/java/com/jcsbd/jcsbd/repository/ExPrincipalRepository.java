package com.jcsbd.jcsbd.repository;

import com.jcsbd.jcsbd.model.ExPrincipal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExPrincipalRepository extends JpaRepository<ExPrincipal, Long> {
}