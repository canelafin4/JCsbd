package com.jcsbd.jcsbd.model;

import jakarta.persistence.*;
import lombok.Data;
import java.util.List;

@Entity
@Table(name = "Treino")
@Data
public class Treino {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    @ManyToMany
    @JoinTable(
        name = "treino_exercicio", //a tabela treino_exercicio é onde fica armazenado os id dos exercicios feitos no treino relacionado com o id do treino
        joinColumns = @JoinColumn(name = "treino_id"),
        inverseJoinColumns = @JoinColumn(name = "exercicio_id")
    )
    private List<Exercicio> exercicios;

}
