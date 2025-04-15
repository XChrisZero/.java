package classes;

import enums.Modelo;
import interfaces.Pintura;
import interfaces.Veiculo;
import records.Documento;

import java.awt.*;
// sempre que for trabalhar com herança multipla POO não faz, mas interfaces sim.
public class Carro implements Veiculo, Pintura
{
    //propriedades
    private String marca;
    private Color cor;
    private Modelo modelo;
    private Documento documentacao;

    //construtor (Alt + insert)
    public Carro(String marca, Color cor, Modelo modelo, Documento documentacao)
    {
        this.marca = marca;
        this.cor = denirCor(cor);
        this.modelo = modelo;
        this.documentacao = documentacao;
    }

    //getters
    public String getMarca()
    {
        return marca;
    }

    public Color getCor()
    {
        return cor;
    }

    public Modelo getModelo()
    {
        return modelo;
    }

    public Documento getDocumentacao()
    {
        return documentacao;
    }


    //setters
    // cor por que ja tem
    // e documentação por que é imutavel
    public void setMarca(String marca)
    {
        this.marca = marca;
    }

    public void setModelo(Modelo modelo)
    {
        this.modelo = modelo;
    }


    // metodo da interface pintura
    @Override
    public Color denirCor(Color cor)
    {
        return cor;
    }


    // metodos da interface veiculo
    @Override
    public void acelerar()
    {

    }


    // metodos da interface veiculo
    @Override
    public void frear()
    {

    }


   //sobre escrita do metodo para transformar a classe em uma string
    @Override
    public String toString() {
        return "Carro{" +
                "marca='" + marca + '\'' +
                ", cor=" + cor +
                ", modelo=" + modelo +
                ", documentacao=" + documentacao +
                '}';
    }

}
