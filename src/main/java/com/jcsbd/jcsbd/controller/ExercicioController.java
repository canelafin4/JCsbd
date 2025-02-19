package com.jcsbd.jcsbd.controller;

import org.springframework.web.bind.annotation.*;

import com.jcsbd.jcsbd.model.Exercicio;

@RestController
@RequestMapping("exercicio")
public class ExercicioController {

    @PostMapping
    public Exercicio save(@RequestBody Exercicio exercicio) {
        System.out.println("Exercício recebido: " + exercicio);
        return exercicio;
    }
}
