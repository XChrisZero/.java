package com.curso.gameAPIv1.models;

import jakarta.persistence.*;
import org.springframework.boot.autoconfigure.web.WebProperties;

import java.time.Year;

// serve para indicar a criação da tabela
@Entity
public class Game {

    //serve para indicar uma coluna ou campo da tabela Game
    @Column
    @Id // Indicando a chave primaria PK
    @GeneratedValue(strategy = GenerationType.IDENTITY) // auto incremento
    private Integer id;


    @Column
    private String titulo;

    @Column
    private String publicadora;

    @Column
    private String genero;

    @Column
    private Year ano;


}
