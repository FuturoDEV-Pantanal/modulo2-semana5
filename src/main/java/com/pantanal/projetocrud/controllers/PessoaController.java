package com.pantanal.projetocrud.controllers;

import com.pantanal.projetocrud.model.Pessoa;
import com.pantanal.projetocrud.service.PessoaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/pessoas")
public class PessoaController {

    @Autowired
    private PessoaService pessoaService;

    @PostMapping
    public ResponseEntity<Pessoa> salvar(@RequestBody Pessoa pessoa) {
        return new ResponseEntity<Pessoa>(pessoaService.salvar(pessoa), HttpStatus.CREATED);

    }

    @PutMapping
    public ResponseEntity<Pessoa> atualizar(@RequestBody Pessoa pessoa) {
        return new ResponseEntity<Pessoa>(pessoaService.salvar(pessoa), HttpStatus.OK);

    }




}
