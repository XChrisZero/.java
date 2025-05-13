package com.curso.listacompras.models;

import jakarta.persistence.*;

@Entity
public class Item {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column
    private Integer quantidade;

    @Column
    private String nome;

    @Column
    private float preco;

    //Construtores
    public Item(Integer quantidade, String nome, float preco) {
        this.quantidade = quantidade;
        this.nome = nome;
        this.preco = preco;
    }

    public Item() {
    }

    //Getters
    public Integer getId() {
        return id;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public String getNome() {
        return nome;
    }

    public float getPreco() {
        return preco;
    }

    //Setters
    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    //Sobrescrita do meétod0 toString
    @Override
    public String toString() {
        return "Item{" +
                "id=" + id +
                ", quantidade=" + quantidade +
                ", nome='" + nome + '\'' +
                ", preco=" + preco +
                '}';
    }
}
