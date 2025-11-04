package com.clinica.clinica.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.clinica.clinica.models.medico;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping("/dadosMedico")
public class dadosMedico {

    @GetMapping("dados-medico")
    public String exibirDadosMedico() {
        medico m1 = new medico("Dr. João Souza", "987.654.321-00", "(11) 91234-5678", "dr.joao@email.com", "01/01/1985",
                "Cardiologia", "CRM 12345");
        return Map.of(
                "Nome", m1.getNome(),
                "CPF", m1.getCpf(),
                "Telefone", m1.getTelefone(),
                "Email", m1.getEmail(),
                "Data de Nascimento", m1.getDtNasc(),
                "Especialidade", m1.getEspecialidade(),
                "CRM", m1.getCrm()).toString();
    }

}
