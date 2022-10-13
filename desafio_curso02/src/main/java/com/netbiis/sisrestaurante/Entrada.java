package com.netbiis.sisrestaurante;

import java.util.ArrayList;

public final class Entrada extends Produto {
    public static ArrayList<Entrada> entradas = new ArrayList<Entrada>();
    private Comida comida;

    public Entrada(String nome, Comida comida) {
        super.nome = nome;
        this.comida = comida;
        Entrada.entradas.add(this);
    }

    
    @Override
    public String toString() {
        return "Entrada [comida=" + comida + "]";
    }


    public static ArrayList<Entrada> getEntradas() {
        return entradas;
    }

    public static void listarEntradas(){
        for (Entrada entrada : entradas) {
            System.out.println(entrada);
        }
    }

    public static void setEntradas(ArrayList<Entrada> entradas) {
        Entrada.entradas = entradas;
    }
    public static Entrada getEntrada(String nome){
        for (Entrada item : entradas) {
            if (item.getNome().equals(nome)) {
                return item;
            }
        }
        return null;
    }

    public Comida getComida() {
        return comida;
    }

    public void setComida(Comida comida) {
        this.comida = comida;
    }    
}
