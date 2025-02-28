package com.jcsbd.jcsbd.controller;

import com.jcsbd.jcsbd.dto.TreinoDTO;
import com.jcsbd.jcsbd.model.Exercicio;
import com.jcsbd.jcsbd.model.Treino;
import com.jcsbd.jcsbd.repository.ExercicioRepository;
import com.jcsbd.jcsbd.repository.TreinoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("treinos")
public class TreinoController {

    @Autowired
    private TreinoRepository treinoRepository;

    @Autowired
    private ExercicioRepository exercicioRepository;

    @PostMapping
    public Treino criarTreino(@RequestBody TreinoDTO treinoDTO) {
        Treino treino = new Treino();
        treino.setNome(treinoDTO.nome());

        List<Exercicio> exercicios = exercicioRepository.findAllById(treinoDTO.exerciciosIds());
        treino.setExercicios(exercicios);

        return treinoRepository.save(treino);
    }
}
