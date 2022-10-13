package com.netbiis.sisrestaurante;

import java.util.ArrayList;

public final class Promocao extends Produto {
    public static ArrayList<Promocao> promocoes = new ArrayList<Promocao>();
    private Comida comida;
    
    public Promocao(String nome, Comida comida) {
        super.nome = nome;
        this.comida = comida;
        Promocao.promocoes.add(this);
    }

    
    @Override
    public String toString() {
        return "Promocao" + super.getNome() + "[comida=" + comida + "]";
    }

    public static ArrayList<Promocao> getPromocoes() {
        return promocoes;
    }
    public static Promocao getPromocao(String nome){
        for (Promocao promocao : promocoes) {
            if (promocao.getNome().equals(nome)) {
                return promocao;
            }
        }
        return null;
    }
    public static void setPromocoes(ArrayList<Promocao> promocoes) {
        Promocao.promocoes = promocoes;
    }
    public static void listaPromocoes() {
        for (Promocao promocao : promocoes) {
            System.out.println(promocao);
        }
    }
    public static void addPromocoes(Promocao promocao){
        Promocao.promocoes.add(promocao);
    }
    public Comida getComida() {
        return comida;
    }
    public void setComida(Comida comida) {
        this.comida = comida;
    }
    
}
