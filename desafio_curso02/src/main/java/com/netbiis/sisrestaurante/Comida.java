package com.netbiis.sisrestaurante;

import java.util.ArrayList;

public class Comida {
    protected String nome; 
    protected String descricao;
    protected float preco;
    protected String imagem;


    public Comida(String nome, String descricao, float preco, String imagem) {
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
        this.imagem = imagem;
    }

    @Override
    public String toString() {
        return "Entrada [nome=" + nome + ", descricao=" + descricao + ", preco=" + preco + "]";
    }

    public static void setEntradas(ArrayList<Entrada> entradas) {
        Entrada.entradas = entradas;
    }

    public static void addEntrada(Entrada entrada){
        Entrada.entradas.add(entrada);
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getImagem() {
        return imagem;
    }

    public void setImagem(String imagem) {
        this.imagem = imagem;
    }
}
