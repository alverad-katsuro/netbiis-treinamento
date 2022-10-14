package com.netbiis.sisrestaurante;

import java.util.ArrayList;
/**
* Classe com o restaurante de sushi
* @author Alfredo Gabriel
* @version 1.0
* @since 13/10/2022
*/
public final class Hall_Wassabi extends Produto {
    public static ArrayList<Hall_Wassabi> wassabis = new ArrayList<Hall_Wassabi>();
    private Comida comida;

    public Hall_Wassabi(String nome, Comida comida) {
        super.nome = nome;
        this.comida = comida;
        Hall_Wassabi.wassabis.add(this);
    }

    
    
    /** 
     * Sobreescreve a apresentação do objeto Hall_Wassabi.
     * @return String - Apresentação do Objeto
     */
    @Override
    public String toString() {
        return "Hall_Wassabi" + super.getNome() + "[comida=" + comida + "]";
    }


    
    /** 
     * Retorna todas as instancias do Hall_Wassabi instanciadas.
     * @return ArrayList<Hall_Wassabi> - Ponteiros
     */
    public static ArrayList<Hall_Wassabi> getWassabis() {
        return wassabis;
    }
    
    /** 
     * Sobreescreve a lista com os ponteiros para as instancias de Hall_Wassabi.
     * @param wassabis - Ponteiros
     */
    public static void setWassabis(ArrayList<Hall_Wassabi> wassabis) {
        Hall_Wassabi.wassabis = wassabis;
    }
    
    /** 
     * Adiciona uma nova instancia a lista com os ponteiros.
     * @param wassabi - Adiciona um ponteiro a lista de ponteiros.
     */
    public static void addWassabis(Hall_Wassabi wassabi){
        Hall_Wassabi.wassabis.add(wassabi);
    }

    /** 
     * Exibe todos as instancias de Hall_Wassabi.
     */
    public static void listaWassabis() {
        for (Hall_Wassabi hall_Wassabi : wassabis) {
            System.out.println(hall_Wassabi);
        }
    }
    
    /** 
     * Busca uma instancia de Hall_Wassabi através de seu nome. 
     * @param nome - Nome do produto.
     * @return Hall_Wassabi - Instancia do Hall_Wassabi.
     */
    public static Hall_Wassabi getWassabi(String nome){
        for (Hall_Wassabi wassabi : wassabis) {
            if (wassabi.getNome().equals(nome)) {
                return wassabi;
            }
        }
        return null;
    }
    
    
    /** 
     * Retorna a comida.
     * @return Comida - Objeto Comida.
     */
    public Comida getComida() {
        return comida;
    }
    
    /** 
     * Define a comida.
     * @param comida - Objeto Comida.
     */
    public void setComida(Comida comida) {
        this.comida = comida;
    }

    
}
