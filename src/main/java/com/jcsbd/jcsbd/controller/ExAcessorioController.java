package com.jcsbd.jcsbd.controller;

import org.springframework.web.bind.annotation.*;

import com.jcsbd.jcsbd.model.ExAcessorio;
import com.jcsbd.jcsbd.repository.ExAcessorioRepository;

@RestController
@RequestMapping("exacessorio")
public class ExAcessorioController {
    
    private ExAcessorioRepository exAcessorioRepository;

    public ExAcessorioController(ExAcessorioRepository exAcessorioRepository){
        this.exAcessorioRepository = exAcessorioRepository;
    }

    @PostMapping
    public ExAcessorio save(@RequestBody ExAcessorio exAcessorio){
        return exAcessorioRepository.save(exAcessorio);
    }
}
