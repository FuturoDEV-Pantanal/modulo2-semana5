package com.pantanal.projetocrud.service;

import com.pantanal.projetocrud.model.Departamento;
import com.pantanal.projetocrud.repository.DepartamentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DepartamentoService {

    @Autowired
    private DepartamentoRepository departamentoRepository;


    public Departamento salvar(Departamento departamento){
        //regras de negogio antes de salvar o departamento ficariam aqui!
        Departamento depto = departamentoRepository.save(departamento);
        return depto;
    }

    public void deletar(Long id){
        departamentoRepository.deleteById(id);
    }

    public List<Optional<Departamento>> getDepartamentosPorNome(String nome){
          return  departamentoRepository.getDepartemtosPorNome(nome);
    }

    public List<Departamento> getDepartamentos(){
        return departamentoRepository.findAll();
    }





}
