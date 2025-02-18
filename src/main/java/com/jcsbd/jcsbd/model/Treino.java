package com.jcsbd.jcsbd.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name="Treino")
@Data
public class Treino {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;
        private String exercicio1;
        private String exercicio2;
        private String exercicio3;
        private String exercicio4;
        private String exercicio5;
}
