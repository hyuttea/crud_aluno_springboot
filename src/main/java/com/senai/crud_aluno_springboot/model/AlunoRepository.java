package com.senai.crud_aluno_springboot.model;

import org.springframework.data.jpa.repository.JpaRepository;

public interface AlunoRepository extends JpaRepository<Aluno, String>{
}
