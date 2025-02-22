package com.jcsbd.jcsbd.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.jcsbd.jcsbd.model.Exercicio;
import com.jcsbd.jcsbd.repository.ExercicioRepository;

@RestController
@RequestMapping("exercicio")
public class ExercicioController {

    @Autowired
    private ExercicioRepository exercicioRepository;

    @PostMapping
    public Exercicio save(@RequestBody Exercicio exercicio) {
        return exercicioRepository.save(exercicio);
    }
}
