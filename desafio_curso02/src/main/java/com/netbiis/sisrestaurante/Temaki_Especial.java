package com.netbiis.sisrestaurante;

import java.util.ArrayList;

public final class Temaki_Especial extends Produto {
    public static ArrayList<Temaki_Especial> temaki = new ArrayList<Temaki_Especial>();
    private Comida comida;

    public Temaki_Especial(String nome, Comida comida) {
        super.nome = nome;
        this.comida = comida;
        Temaki_Especial.temaki.add(this);
    }
    

    @Override
    public String toString() {
        return "Temaki_Especial" + super.getNome() + "[comida=" + comida + "]";
    }

    public static ArrayList<Temaki_Especial> getTemaki() {
        return temaki;
    }
    public static void setTemaki(ArrayList<Temaki_Especial> temaki) {
        Temaki_Especial.temaki = temaki;
    }
    public static void listaTemaki() {
        for (Temaki_Especial temaki_Especial : temaki) {
            System.out.println(temaki_Especial);
        }
    }
    public static Temaki_Especial getTemaki_Especial(String nome){
        for (Temaki_Especial item : temaki) {
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
