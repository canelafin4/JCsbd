package com.jcsbd.jcsbd.model;

import jakarta.persistence.Entity;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@Data
@EqualsAndHashCode(callSuper = true)
public class ExAcessorio extends Exercicio {
    private int repeticoes; //numero de reps usadas para medir exercicios acessórios

    @Override
    public String getTipo() {
        return super.getTipo().toLowerCase();
    }
}