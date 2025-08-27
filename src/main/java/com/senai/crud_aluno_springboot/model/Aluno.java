package com.senai.crud_aluno_springboot.model;

//spring rodando acima do projeto

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.*;

@Data
@Entity //essa etidade vai ser ma tabela no banco de dados
public class Aluno {
    @Setter
    @Getter
    @Id // chave primaria da entiade na tabela do banco de dados
    @GeneratedValue(strategy = GenerationType.UUID) //quem vai controlar é o springboot jpa vai gerar o valor do ID
    private String id;

    @Setter
    @Getter
    @NotBlank(message = "O Email não pode estar vazio")
    @Column(nullable = false, length = 30)
    private String email;

    @Setter
    @Getter
    @NotBlank(message = "O Nome não pode estar vazio")
    @Column(nullable = false, length = 50)
    private String nome;

    @NotNull(message = "O ID de Acesso não pode estar vazio")
    @Column(nullable = false, length = 10)
    private int idacesso;

    @Setter
    @Getter
    @NotNull(message = "O CPF não pode estar vazio")
    @Column(nullable = false, length = 11)
    private long cpf;

    @Setter
    @Getter
    @NotBlank(message = "O Nome não pode estar vazio")
    @Column(nullable = false, length = 30)
    private String curso;
}
