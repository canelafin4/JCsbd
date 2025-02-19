package com.jcsbd.jcsbd.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jcsbd.jcsbd.model.Exercicio;

@Repository
public interface ExercicioRepository extends JpaRepository <Exercicio, Long>{
    
}
