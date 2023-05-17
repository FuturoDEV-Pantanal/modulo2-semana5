package com.pantanal.projetocrud.service;

import com.pantanal.projetocrud.model.Departamento;
import com.pantanal.projetocrud.repository.DepartamentoRepository;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Slf4j
@Service
public class DepartamentoService {

   // private static final Logger logger = LoggerFactory.getLogger(DepartamentoService.class);

    @Autowired
    private DepartamentoRepository departamentoRepository;




    public Departamento salvar(Departamento departamento){

        log.info("Cadastrando o departamento nome {} e descrição {} no sistema.", departamento.getNome(),
                departamento.getDescricao());

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
