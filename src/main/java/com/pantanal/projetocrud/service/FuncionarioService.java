package com.pantanal.projetocrud.service;

import com.pantanal.projetocrud.model.Funcionario;
import com.pantanal.projetocrud.repository.FuncionarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class FuncionarioService {

    @Autowired
    private FuncionarioRepository funcionarioRepository;

    @Transactional
    public Funcionario salvar(Funcionario funcionario){
        Funcionario f = funcionarioRepository.save(funcionario);
        return f;
    }

    public List<Funcionario> listarTodos(){
        List<Funcionario> funcionarios = funcionarioRepository.findAll();
        return funcionarios;
    }



}
