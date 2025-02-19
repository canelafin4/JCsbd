package com.jcsbd.jcsbd.controller;

import org.springframework.web.bind.annotation.*;

import com.jcsbd.jcsbd.model.Exercicio;
import com.jcsbd.jcsbd.repository.ExercicioRepository;

@RestController
@RequestMapping("exercicio")
public class ExercicioController {

    private ExercicioRepository exercicioRepository;

    public ExercicioController(ExercicioRepository exercicioRepository){
        this.exercicioRepository = exercicioRepository;
    }

    @PostMapping
    public Exercicio save(@RequestBody Exercicio exercicio) {
        return exercicioRepository.save(exercicio);
    }
}
