package com.clinica.clinica.models;

public class paciente extends pessoa {

    private String planoSaude;
    private String tratamento;

    public String getPlanoSaude() {
        return planoSaude;
    }

    public void setPlanoSaude(String planoSaude) {
        this.planoSaude = planoSaude;
    }

    public String getTratamento() {
        return tratamento;
    }

    public void setTratamento(String tratamento) {
        this.tratamento = tratamento;
    }

    public paciente(String nome, String cpf, String telefone, String email, String dtNasc, String planoSaude,
            String tratamento) {
        super(nome, cpf, telefone, email, dtNasc);
        this.planoSaude = planoSaude;
        this.tratamento = tratamento;
    }

}
