package com.entrega1;

public class Cliente {
    public String nome;
    public int idade;
    public String sexo;
    public String profissao;

    public Cliente (String nome, int idade, String sexo, String profissao) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.profissao = profissao;
    }

    public void status() {
        System.out.println("Nome: " + this.getNome() + "/n Idade: " + this.getIdade() + "/n Sexo: " + this.getSexo() + "/n Profissao: " + this.getProfissao()); 
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

}
