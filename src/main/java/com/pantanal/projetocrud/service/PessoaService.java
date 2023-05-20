package com.pantanal.projetocrud.service;


import com.pantanal.projetocrud.model.Pessoa;
import com.pantanal.projetocrud.repository.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class PessoaService {

    @Autowired
    private PessoaRepository pessoaRepository;


    @Transactional
    public Pessoa salvar(Pessoa pessoa){
         return pessoaRepository.save(pessoa);
    }

    public List<Pessoa> getPessoas(){
        return pessoaRepository.findAll();
    }

    @Transactional
    public void deletarPessoaPorId(Long id){
        pessoaRepository.deleteById(id);
    }

    public List<Pessoa> findByNomeContaining(String nome){
        List<Pessoa> pessoas = pessoaRepository.findByNomeContaining(nome);
        return  pessoas;
    }

    public Pessoa obterPessoaPorId(String id){
        Pessoa pessoa = pessoaRepository.findById(id);
        return pessoa;
    }


}
