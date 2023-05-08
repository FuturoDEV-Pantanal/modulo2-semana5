package com.pantanal.projetocrud.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.OffsetDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "pessoa")
public class Pessoa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 60)
    private String nome;


    @Column(length = 120)
    private String email;


    @Column(length = 25)
    private String telefone;

    @Column(length = 25)
    private String celular;

    //@Column(columnDefinition = "timestamp without time zone DEFAULT timezone('utc'::text, CURRENT_TIMESTAMP(0))", updatable = false)
    //private OffsetDateTime dataHoraCadastro;


}
