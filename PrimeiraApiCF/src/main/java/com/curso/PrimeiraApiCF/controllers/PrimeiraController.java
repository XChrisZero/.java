package com.curso.PrimeiraApiCF.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

// Anotação para indicar uma rest controller
@RestController
public class PrimeiraController {

    //primeiro EndPoint
    @GetMapping("/end-a")
    public String primeiroEndPoint(){
        return "Bem-vindo ao endPoint_A";
    }

    // Endpoint com paramentro
    @GetMapping("/hello")
    public String hello (@RequestParam String nome ){
        return "Olá" + nome;
    }
}
