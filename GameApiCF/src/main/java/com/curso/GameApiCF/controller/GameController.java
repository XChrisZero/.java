package com.curso.GameApiCF.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class GameController {

    // captando todos os games
    @GetMapping("/allgames")
    public String todosGames(){
        return criarGames().toString();
    }

    // captando um game por id
    @GetMapping("/gamebyid")
    public String umGamePorId(@RequestParam int id){

        return criarGames().get(id);
    }


    // mock = simulação de dados
    // criando um MOCK de dados de games
    private ArrayList<String> criarGames(){

        ArrayList<String> games = new ArrayList<>();
        games.add("Super mario World");
        games.add("Resident Evil");
        games.add("Metal Gear Solid");

        return games;

    }

}
