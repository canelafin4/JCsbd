package com.jcsbd.jcsbd.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jcsbd.jcsbd.model.Treino;
import com.jcsbd.jcsbd.repository.TreinoRepository;

@RestController
@RequestMapping("treino")
public class TreinoController {
    
    private TreinoRepository treinoRepository;

    public TreinoController (TreinoRepository treinoRepository){
        this.treinoRepository = treinoRepository;
    }

    @PostMapping
    public Treino save(@RequestBody Treino treino){
        return treinoRepository.save(treino);
    }
}
