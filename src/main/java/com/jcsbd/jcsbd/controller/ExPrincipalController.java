package com.jcsbd.jcsbd.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.jcsbd.jcsbd.model.ExPrincipal;
import com.jcsbd.jcsbd.repository.ExPrincipalRepository;

@RestController
@RequestMapping("exprincipal")
public class ExPrincipalController {
    
    @Autowired
    private ExPrincipalRepository exPrincipalRepository;

    @PostMapping
    public ExPrincipal save(@RequestBody ExPrincipal exPrincipal){
        if(exPrincipal.getNome().equals("supino")  || exPrincipal.getNome().equals("agachamento") || exPrincipal.getNome().equals("levantamento")){
            return exPrincipalRepository.save(exPrincipal);
        }else{
            return exPrincipal;
        }
    }
 

}
