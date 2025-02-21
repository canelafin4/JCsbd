package com.jcsbd.jcsbd.repository;

import com.jcsbd.jcsbd.model.ExAcessorio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExAcessorioRepository extends JpaRepository<ExAcessorio, Long> {
}