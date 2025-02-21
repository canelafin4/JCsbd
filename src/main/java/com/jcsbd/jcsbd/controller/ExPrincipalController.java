package com.jcsbd.jcsbd.controller;

import org.springframework.web.bind.annotation.*;

import com.jcsbd.jcsbd.model.ExPrincipal;
import com.jcsbd.jcsbd.repository.ExPrincipalRepository;

@RestController
@RequestMapping("exprincipal")
public class ExPrincipalController {
    
    private ExPrincipalRepository exPrincipalRepository;

    public ExPrincipalController(ExPrincipalRepository exPrincipalRepository){
        this.exPrincipalRepository = exPrincipalRepository;
    }

    @PostMapping
    public ExPrincipal save(@RequestBody ExPrincipal exPrincipal){
        return exPrincipalRepository.save(exPrincipal);
    }
}
