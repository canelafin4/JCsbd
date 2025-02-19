package com.jcsbd.jcsbd.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jcsbd.jcsbd.model.Treino;

@Repository
public interface TreinoRepository extends JpaRepository<Treino, Long>{

}