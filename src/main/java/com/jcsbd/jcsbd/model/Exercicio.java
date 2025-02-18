package com.jcsbd.jcsbd.model;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Inheritance(strategy = InheritanceType.JOINED)

public abstract class Exercicio {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private int series;

    public Exercicio() {}

    public Exercicio(String nome, int series) {
        this.nome = nome;
        this.series = series;
    }

}
