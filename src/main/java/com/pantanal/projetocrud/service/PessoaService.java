package com.pantanal.projetocrud.service;


import com.pantanal.projetocrud.model.Pessoa;
import com.pantanal.projetocrud.repository.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PessoaService {

    @Autowired
    private PessoaRepository pessoaRepository;


    public Pessoa salvar(Pessoa pessoa){
         return pessoaRepository.save(pessoa);
    }

    public List<Pessoa> getPessoas(){
        return pessoaRepository.findAll();
    }

    public void deletarPessoaPorId(Long id){
        pessoaRepository.deleteById(id);
    }
}
