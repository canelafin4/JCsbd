package com.jcsbd.jcsbd.model;
import jakarta.persistence.*;

import lombok.Data;

@Entity
@Data
public class ExercicioPrincipal extends Exercicio {
    
    private int intensidade; //nota: percepsão de força da série, medido em RM (repetição máxima)
}
