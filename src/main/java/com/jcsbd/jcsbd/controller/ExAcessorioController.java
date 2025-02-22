package com.jcsbd.jcsbd.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.jcsbd.jcsbd.model.ExAcessorio;
import com.jcsbd.jcsbd.repository.ExAcessorioRepository;

@RestController
@RequestMapping("exacessorio")
public class ExAcessorioController {
    
    @Autowired
    private ExAcessorioRepository exAcessorioRepository;

    @PostMapping
    public ExAcessorio save(@RequestBody ExAcessorio exAcessorio){
        if(exAcessorio.getTipo().equals("acessorio")){
            return exAcessorioRepository.save(exAcessorio);
        }else{
            System.out.println("O exercicio deve ser tipo Acessorio"); //100% para testes 
        }
        return exAcessorio;
    }
}
