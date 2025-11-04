package com.clinica.clinica.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.clinica.clinica.models.paciente;

import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestParam;

@RestController
@RequestMapping("/dadosPaciente")

public class dadosPaciente {

    @GetMapping("/dados-paciente")
    public Map<String, String> exibirDadosPaciente() {
        paciente p1 = new paciente("Ana Silva", "123.456.789-00", "(11) 98765-4321", "ana.silva@email.com",
                "01/01/1990", "Unimed", "Tratamento A");
        return Map.of(
                "Nome", p1.getNome(),
                "CPF", p1.getCpf(),
                "Telefone", p1.getTelefone(),
                "Email", p1.getEmail(),
                "Data de Nascimento", p1.getDtNasc(),
                "Plano de Saúde", p1.getPlanoSaude(),
                "Tratamento", p1.getTratamento());
    }

}
