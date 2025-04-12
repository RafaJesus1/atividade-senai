package com.example.atividade4_senai_spring;

public class Paciente {
    private int idPaciente;
    private String nome;
    private String cpf;
    private int idade;
    private String sexo;
    private String telefone;

    public Paciente(String nome, String cpf, int idade, String sexo,String telefone) {
        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;
        this.sexo = sexo;
        this.telefone = telefone;
    }

    public int getIdPaciente() {
        return idPaciente;
    }

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

    @Override
    public String toString() {
        return "\nNome: " + nome +
                "\nCPF: " + cpf +
                "\nIdade: " + idade +
                "\nTelefone: " + telefone + "\n";
    }
}
