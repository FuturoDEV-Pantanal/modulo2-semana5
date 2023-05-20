package com.pantanal.projetocrud.repository;

import com.pantanal.projetocrud.model.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PessoaRepository extends JpaRepository<Pessoa, Long> {

    public List<Pessoa> findByNomeContaining(@Param("nome") String nome);

    public Pessoa findById(@Param("id") String id);
}
