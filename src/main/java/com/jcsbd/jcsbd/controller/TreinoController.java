package com.jcsbd.jcsbd.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jcsbd.jcsbd.model.Treino;

@RestController
@RequestMapping("treino")
public class TreinoController {
    
    @PostMapping
    public Treino save(@RequestBody Treino treino){
        System.out.println("exercicios do treino: "+ treino);
        return treino;
    }
}
