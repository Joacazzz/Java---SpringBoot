package com.clinica.clinica.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.clinica.clinica.models.atendente;

import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/dadosAtendente")
public class dadosAtendente {

    @GetMapping("dados-atendente")
    public String getMethodName() {

        atendente p1 = new atendente
        ("Marcos Lima", "555.666.777-88",
         "(11) 99876-5432", "marcos.lima@email.com",
          "01/01/1990", "Recepção");
        return Map.of(
                "Nome", p1.getNome(),
                "CPF", p1.getCpf(),
                "Telefone", p1.getTelefone(),
                "Email", p1.getEmail(),
                "Data de Nascimento", p1.getDtNasc(),
                "Setor", p1.getSetor()).toString();
    }
    
    
}
