package com.senai.crud_aluno_springboot.controller;

import com.senai.crud_aluno_springboot.model.Aluno;
import com.senai.crud_aluno_springboot.model.AlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public class AlunoController {
    @RestController
    @RequestMapping("/aluno")
    public class ProductController {

        @Autowired
        private AlunoRepository alunoRepository;

        // Método para criar um novo aluno
        @PostMapping
        public Aluno createAluno(@RequestBody Aluno aluno) {
            return alunoRepository.save(aluno);
        }
        // Método para listar todos os aluno
        @GetMapping
        public List<Aluno> getAllAluno() {
            return alunoRepository.findAll();
        }
        //Método para buscar um açuno por ID
        @GetMapping("/{id}")
        public Aluno getAlunoById(@PathVariable String id) {
            return alunoRepository.findById(id)
                    .orElseThrow(() -> new RuntimeException("Aluno não encontrado"));
        }

        /* Método para atualizar um aluno
        @PutMapping("/{id}")
        public Aluno updateAluno(@PathVariable String id, @RequestBody Aluno alunotDetails) {
            Aluno aluno = alunoRepository.findById(id)
                    .orElseThrow(() -> new RuntimeException("Aluno não encontrado"));

            aluno.setNome(alunotDetails.getNome());

            return alunoRepository.save(aluno);
        }*/

        @DeleteMapping("/{id}")
        public void deleteProduct(@PathVariable String id) {
            alunoRepository.deleteById(id);
        }
    }
}
