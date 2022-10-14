package com.netbiis.sisrestaurante;

import java.util.ArrayList;
/**
* Categoria que compõem o menu.
* @author Alfredo Gabriel
* @version 1.0
* @since 13/10/2022
*/
public final class Entrada extends Produto {
    public static ArrayList<Entrada> entradas = new ArrayList<Entrada>();
    private Comida comida;

    public Entrada(String nome, Comida comida) {
        super.nome = nome;
        this.comida = comida;
        Entrada.entradas.add(this);
    }

    
    
    /** 
     * Sobreescreve a apresentação do objeto.
     * @return String - To String
     */
    @Override
    public String toString() {
        return "Entrada [comida=" + comida + "]";
    }


    
    /** 
     * Retorna a lista com os objetos.
     * @return ArrayList<Entrada> - Ponteiros.
     */
    public static ArrayList<Entrada> getEntradas() {
        return entradas;
    }

    /** 
     * Apresenta os objetos.
     */
    public static void listarEntradas(){
        for (Entrada entrada : entradas) {
            System.out.println(entrada);
        }
    }

    
    /** 
     * Sobreescreve os a lista com os ponteiros.
     * @param entradas - Ponteiros.
     */
    public static void setEntradas(ArrayList<Entrada> entradas) {
        Entrada.entradas = entradas;
    }
    
    /** 
     * Busca um item atraves de seu nome.
     * @param nome - Nome do Produto.
     * @return Entrada - Um objeto do tipo Produto.
     */
    public static Entrada getEntrada(String nome){
        for (Entrada item : entradas) {
            if (item.getNome().equals(nome)) {
                return item;
            }
        }
        return null;
    }

    
    /** 
     * Retorna a comida deste produto.
     * @return Comida - Objeto Comida.
     */
    public Comida getComida() {
        return comida;
    }

    
    /** 
     * Define a comida deste produto.
     * @param comida - Objeto Comida.
     */
    public void setComida(Comida comida) {
        this.comida = comida;
    }    
}
