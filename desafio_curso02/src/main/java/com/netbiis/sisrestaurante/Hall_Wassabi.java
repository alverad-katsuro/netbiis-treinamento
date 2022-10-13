package com.netbiis.sisrestaurante;

import java.util.ArrayList;

public final class Hall_Wassabi extends Produto {
    public static ArrayList<Hall_Wassabi> wassabis = new ArrayList<Hall_Wassabi>();
    private Comida comida;

    public Hall_Wassabi(String nome, Comida comida) {
        super.nome = nome;
        this.comida = comida;
        Hall_Wassabi.wassabis.add(this);
    }

    
    @Override
    public String toString() {
        return "Hall_Wassabi" + super.getNome() + "[comida=" + comida + "]";
    }


    public static ArrayList<Hall_Wassabi> getWassabis() {
        return wassabis;
    }
    public static void setWassabis(ArrayList<Hall_Wassabi> wassabis) {
        Hall_Wassabi.wassabis = wassabis;
    }
    public static void addWassabis(Hall_Wassabi wassabi){
        Hall_Wassabi.wassabis.add(wassabi);
    }
    public static void listaWassabis() {
        for (Hall_Wassabi hall_Wassabi : wassabis) {
            System.out.println(hall_Wassabi);
        }
    }
    public static Hall_Wassabi getWassabi(String nome){
        for (Hall_Wassabi wassabi : wassabis) {
            if (wassabi.getNome().equals(nome)) {
                return wassabi;
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
