package com.senai.crud_aluno_springboot.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
//spring rodando acima do projeto

@Entity //essa etidade vai ser ma tabela no banco de dados
    public class Aluno {
    @Id // chave primaria da entiade na tabela do banco de dados
    @GeneratedValue(strategy = GenerationType.UUID) //quem vai controlar é o springboot jpa vai gerar o valor do ID
    private String ID;
    private String nome;
    private String email;
    private int IDAcesso;
    private String CPF;
    private String curso;

    public Aluno(String ID, String nome, String email, int IDAcesso, String CPF, String curso) {
        this.ID = ID;
        this.nome = nome;
        this.email = email;
        this.IDAcesso = IDAcesso;
        this.CPF = CPF;
        this.curso = curso;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getIDAcesso() {
        return IDAcesso;
    }

    public void setIDAcesso(int IDAcesso) {
        this.IDAcesso = IDAcesso;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
}
