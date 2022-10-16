package com.curso3.unidade3.netbiis.sisrestaurante;

import java.util.ArrayList;
/**
* Classe com o restaurante de sushi
* @author Alfredo Gabriel
* @version 1.0
* @since 13/10/2022
*/
public final class Promocao extends Produto {
    public static ArrayList<Promocao> promocoes = new ArrayList<Promocao>();
    private Comida comida;
    
    public Promocao(String nome, Comida comida) {
        super.nome = nome;
        this.comida = comida;
        Promocao.promocoes.add(this);
    }

    
    
    /** 
     * Sobreescreve a forma de exibir um objeto demonstrandos seus atributos.
     * @return String - Apresentação.
     */
    @Override
    public String toString() {
        return "Promocao" + super.getNome() + "[comida=" + comida + "]";
    }

    
    /** 
     * Retorna a lista com todos objetos da classe Promocao.
     * @return ArrayList<Promocao> - Ponteiros.
     */
    public static ArrayList<Promocao> getPromocoes() {
        return promocoes;
    }
    
    /** 
     * Busca um objeto da classe Promocao atraves de seu nome.
     * @param nome - Nome do objeto.
     * @return Promocao - Objeto.
     */
    public static Promocao getPromocao(String nome){
        for (Promocao promocao : promocoes) {
            if (promocao.getNome().equals(nome)) {
                return promocao;
            }
        }
        return null;
    }
    
    /** 
     * Sobreescreve a lista contendo os endereços das instancias de Promocao.
     * @param promocoes - Objeto.
     */
    public static void setPromocoes(ArrayList<Promocao> promocoes) {
        Promocao.promocoes = promocoes;
    }

    /** 
     * Lista todos os objetos instanciados da classe Promoção presente na lista.
     */
    public static void listaPromocoes() {
        for (Promocao promocao : promocoes) {
            System.out.println(promocao);
        }
    }
    
    /** 
     * Adiciona um objeto da classe Promoção a Lista de Objetos da classe Promoção.
     * @param promocao - Objeto.
     */
    public static void addPromocoes(Promocao promocao){
        Promocao.promocoes.add(promocao);
    }
    
    /** 
     * Retorna a comida definida nesta instancia.
     * @return Comida - Objeto.
     */
    public Comida getComida() {
        return comida;
    }
    
    /** 
     * Define uma comida para este produto.
     * @param comida - Objeto.
     */
    public void setComida(Comida comida) {
        this.comida = comida;
    }
    
}
