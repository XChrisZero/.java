import classes.Carro;
import enums.Modelo;
import records.Documento;

import java.awt.*;

public class Main
{
    public static void main(String[] args)
    {
        //Criando um carro
        Carro carro1 = new Carro(
                "VW",
                Color.BLUE,
                Modelo.HATCH,
                new Documento("000000", "0000")
        );
        System.out.println(carro1.toString());

    }
}


// protoco = interface são a mesma coisa em POO
// interface é um contrato