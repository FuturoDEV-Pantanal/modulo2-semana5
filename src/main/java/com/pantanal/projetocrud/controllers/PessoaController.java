package com.pantanal.projetocrud.controllers;

import com.pantanal.projetocrud.model.Pessoa;
import com.pantanal.projetocrud.service.PessoaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/pessoas") // localhost:8080/pessoas
public class PessoaController {

    @Autowired
    private PessoaService pessoaService;

    @PostMapping
    public ResponseEntity<Pessoa> salvar(@RequestBody Pessoa pessoa) {
        Pessoa p =  pessoaService.salvar(pessoa);
        return new ResponseEntity<Pessoa>(p, HttpStatus.CREATED);

    }

    @PutMapping
    public ResponseEntity<Pessoa> atualizar(@RequestBody Pessoa pessoa) {
        return new ResponseEntity<Pessoa>(pessoaService.salvar(pessoa), HttpStatus.OK);

    }

    @DeleteMapping(value = "/{id}" )
    public ResponseEntity<String> deletar(@PathVariable Long id){
        pessoaService.deletarPessoaPorId(id);
        return new ResponseEntity<String>("O pessoas de ID: "+id+" foi deletado com sucesso ", HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<List<Pessoa>> listarTodas(){
        List<Pessoa> pessoas = pessoaService.getPessoas();

        if(!pessoas.isEmpty())
            return new ResponseEntity<List<Pessoa>>(pessoas, HttpStatus.FOUND);
        else
            return new ResponseEntity<List<Pessoa>>(pessoas, HttpStatus.NOT_FOUND);
    }

    @GetMapping(value = "/")
    public ResponseEntity<List<Pessoa>> obterPessoasPorNome(@RequestParam String nome){

        List<Pessoa> pessoas = pessoaService.findByNomeContaining(nome);

        if(!pessoas.isEmpty())
            return new ResponseEntity<List<Pessoa>>(pessoas, HttpStatus.FOUND);
        else
            return new ResponseEntity<List<Pessoa>>(pessoas, HttpStatus.NOT_FOUND);
    }

    @GetMapping(value = "/pessoa/{id}")
    public ResponseEntity<Pessoa> obterPessoaPorId(@PathVariable String id){

        Pessoa pessoa = pessoaService.obterPessoaPorId(id);

        if(pessoa != null)
            return new ResponseEntity<Pessoa>(pessoa, HttpStatus.FOUND);
        else
            return new ResponseEntity<Pessoa>(pessoa, HttpStatus.NOT_FOUND);

    }




}
