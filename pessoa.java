package com.clinica.clinica.models;

abstract class pessoa {
    // atributos
    private String nome;
    private String cpf;
    private String telefone;
    private String email;
    private String dtNasc;

    // métodos acessores
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDtNasc() {
        return dtNasc;
    }

    public void setDtNasc(String dtNasc) {
        this.dtNasc = dtNasc;
    }

    // métodos construtores
    public pessoa(String nome, String cpf, String telefone, String email, String dtNasc) {
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.email = email;
        this.dtNasc = dtNasc;
    }

    // Getters and Setters
}
