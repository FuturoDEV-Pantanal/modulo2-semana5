package com.pantanal.projetocrud.repository;

import com.pantanal.projetocrud.model.Departamento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface DepartamentoRepository extends JpaRepository<Departamento, Long> {

    @Query("from Departamento d where upper(d.nome) like %:nome% ")
    List<Optional<Departamento>> getDepartemtosPorNome(String nome);
}
