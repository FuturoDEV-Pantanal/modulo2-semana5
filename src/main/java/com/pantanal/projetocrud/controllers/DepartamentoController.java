package com.pantanal.projetocrud.controllers;

import com.pantanal.projetocrud.model.Departamento;
import com.pantanal.projetocrud.service.DepartamentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/departamentos") // localhost:8080/departamentos
public class DepartamentoController {

    @Autowired
    private DepartamentoService departamentoService;

    @PostMapping
    public ResponseEntity<Departamento> salvar(@RequestBody Departamento departamento) {
       // departamento = null;
        Departamento depto = departamentoService.salvar(departamento);
        return new ResponseEntity<Departamento>(depto, HttpStatus.CREATED);
    }

    @PutMapping
    public ResponseEntity<Departamento> atualizar(@RequestBody Departamento departamento) {
        Departamento depto = departamentoService.salvar(departamento);
        return new ResponseEntity<Departamento>(depto, HttpStatus.OK);
    }

    @DeleteMapping
    public ResponseEntity<String> deletar(@RequestParam Long id) {
        departamentoService.deletar(id);
        return new ResponseEntity<String>("O Departamento de id: " + id + " foi deletado com sucesso!", HttpStatus.OK);
    }

    @GetMapping(value = "/nome")
    public ResponseEntity<List<Optional<Departamento>>> listarDepartamentosPorNome(@RequestParam String nome){
        //localhost:8080/departamentos/nome
        List<Optional<Departamento>> departamentos = departamentoService.getDepartamentosPorNome(nome);
        return  new ResponseEntity<List<Optional<Departamento>>>(departamentos, HttpStatus.FOUND);
    }

    //localhost:8080/departamentos
    @GetMapping
    public ResponseEntity<List<Departamento>> listarTodosDepartamentos(){
        return new ResponseEntity<List<Departamento>>(departamentoService.getDepartamentos(), HttpStatus.FOUND);
    }

}
