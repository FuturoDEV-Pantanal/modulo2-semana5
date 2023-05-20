package com.pantanal.projetocrud.model;

import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.time.OffsetDateTime;

@Getter
@Setter
@Entity
@Table(name = "funcionario")
public class Funcionario implements Serializable {

    @EqualsAndHashCode.Include
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private double salario;

    private OffsetDateTime dataHoraCadastro;

    private OffsetDateTime dataHoraContrato;

    private String estado;

    @OneToOne
    @JoinColumn(name = "id_pessoa", foreignKey = @ForeignKey(name = "fk_pessoa"), unique = true)
    private Pessoa pessoa;

    @OneToOne
    @JoinColumn(name="id_departamento", foreignKey = @ForeignKey(name = "fk_departamento"))
    private Departamento departamento;


}
