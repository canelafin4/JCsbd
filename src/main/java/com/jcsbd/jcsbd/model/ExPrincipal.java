package com.jcsbd.jcsbd.model;

import jakarta.persistence.Entity;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@Data
@EqualsAndHashCode(callSuper = true)
public class ExPrincipal extends Exercicio {
    private int rm; //Séries dos exercicios principais (sbd) são medidos por RM (reps maximas)
}