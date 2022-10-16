package com.curso3.unidade3.netbiis.sisrestaurante;

import java.util.ArrayList;
/**
* Categoria que compoem o menu.
* @author Alfredo Gabriel
* @version 1.0
* @since 13/10/2022
*/
public final class Temaki_Especial extends Produto {
    public static ArrayList<Temaki_Especial> temaki = new ArrayList<Temaki_Especial>();
    private Comida comida;

    /** 
     * Construtor da classe
     * @return Temaki_Especial 
     */

    public Temaki_Especial(String nome, Comida comida) {
        super.nome = nome;
        this.comida = comida;
        Temaki_Especial.temaki.add(this);
    }
    

    
    /** 
     * Sobrecarga do metodo toString a fim de melhor apresentaçar o objeto
     * @return String 
     */
    @Override
    public String toString() {
        return "Temaki_Especial" + super.getNome() + "[comida=" + comida + "]";
    }

    
    /** 
     * Retorna o ArrayList contendo todos os objetos ativos de Temaki_Especial
     * @return ArrayList<Temaki_Especial>
     */
    public static ArrayList<Temaki_Especial> getTemaki() {
        return temaki;
    }
    
    /** 
     * Recebe um arraylist com os produtos da categoria temaki
     * @param temaki 
     */
    public static void setTemaki(ArrayList<Temaki_Especial> temaki) {
        Temaki_Especial.temaki = temaki;
    }

    /**
     * Lista os produtos cadastrados.
     */
    public static void listaTemaki() {
        for (Temaki_Especial temaki_Especial : temaki) {
            System.out.println(temaki_Especial);
        }
    }
    
    /** 
     * Busca um determinado produto na categoria Temaki_Especial
     * @param nome
     * @return Temaki_Especial
     */
    public static Temaki_Especial getTemaki_Especial(String nome){
        for (Temaki_Especial item : temaki) {
            if (item.getNome().equals(nome)) {
                return item;
            }
        }
        return null;
    }
    
    /** 
     * Retorna a comida cadastrada nesta Categoria
     * @return Comida
     */
    public Comida getComida() {
        return comida;
    }
    
    /** 
     * Define uma comida nesta categoria
     * @param comida
     */
    public void setComida(Comida comida) {
        this.comida = comida;
    }
    

        
}
