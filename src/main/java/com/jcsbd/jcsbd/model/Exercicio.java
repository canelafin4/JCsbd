package com.jcsbd.jcsbd.model;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Inheritance(strategy = InheritanceType.JOINED)
@Table(name = "Exercicio")
public class Exercicio {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String tipo; //nota: ser for ExPrincipal as únicas opções à serem escolhidas serão o clássico SBD (squat, bench and deadlift)
    private int series;
}
 