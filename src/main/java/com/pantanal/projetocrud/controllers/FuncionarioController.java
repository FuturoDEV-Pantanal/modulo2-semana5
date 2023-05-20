package com.pantanal.projetocrud.controllers;

import com.pantanal.projetocrud.model.Funcionario;
import com.pantanal.projetocrud.service.FuncionarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpOutputMessage;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/funcionarios")
public class FuncionarioController {

    @Autowired
    private FuncionarioService funcionarioService;

    @PostMapping
    public ResponseEntity<Funcionario> salvar(@RequestBody Funcionario funcionario){
        Funcionario f = funcionarioService.salvar(funcionario);
        return new ResponseEntity<Funcionario>(f, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<Funcionario>> listarTodos(){
      List<Funcionario> funcionarios = funcionarioService.listarTodos();
       return new ResponseEntity<List<Funcionario>>(funcionarios, HttpStatus.FOUND);
    }

}
