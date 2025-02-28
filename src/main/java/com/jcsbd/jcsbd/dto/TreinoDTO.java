package com.jcsbd.jcsbd.dto;

import java.util.List;

public record TreinoDTO(String nome, List<Long> exerciciosIds) {}

//nota: O record é um funcionalidade que simplifica a criação de classes imutáveis, evitando aquele blá blá blá de ficar criando construtor, getter, setter e etc... use mais vezes JC.