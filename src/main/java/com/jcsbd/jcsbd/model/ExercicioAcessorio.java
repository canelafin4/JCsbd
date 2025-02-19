package com.jcsbd.jcsbd.model;
import jakarta.persistence.*;

import lombok.Data;

@Entity
@Data
public class ExercicioAcessorio extends Exercicio {
    
    private int repeticoes; //séries de ex acessórios não são medidas por RM e sim pelo número de repetições

}
