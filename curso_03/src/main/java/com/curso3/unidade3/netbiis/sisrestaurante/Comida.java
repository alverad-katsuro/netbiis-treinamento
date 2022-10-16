package com.curso3.unidade3.netbiis.sisrestaurante;

import java.util.ArrayList;
/**
* Objeto que compõem as categorias.
* @author Alfredo Gabriel
* @version 1.0
* @since 13/10/2022
*/
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

    
    /** 
     * Sobreescreve a apresentação do objeto.
     * @return String - Apresentação da Classe.
     */
    @Override
    public String toString() {
        return "Entrada [nome=" + nome + ", descricao=" + descricao + ", preco=" + preco + "]";
    }

    
    /** 
     * Sobreescreve a lisa com os ponteiros para as instancias desta classe.
     * @param entradas - ArrayList contendo os ponteiros.
     */
    public static void setEntradas(ArrayList<Entrada> entradas) {
        Entrada.entradas = entradas;
    }

    
    /** 
     * Adiciona um novo ponteiro a lista.
     * @param entrada - Adiciona um objeto Entrada a lista de ponteiros.
     */
    public static void addEntrada(Entrada entrada){
        Entrada.entradas.add(entrada);
    }

    
    /** 
     * Retorna o preço da comida.
     * @return float - Preço
     */
    public float getPreco() {
        return preco;
    }

    
    /** 
     * Define um preço da comida.
     * @param preco - Preço
     */
    public void setPreco(float preco) {
        this.preco = preco;
    }

    
    /** 
     * Retorna a descrição da comida.
     * @return String - Descrição da comida.
     */
    public String getDescricao() {
        return descricao;
    }

    
    /** 
     * Define a descrição da comida
     * @param descricao - Descrição da comida.
     */
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    
    /** 
     * Retorna o nome da comida.
     * @return String - Nome da Comida.
     */
    public String getNome() {
        return nome;
    }

    
    /** 
     * Define o nome da comida.
     * @param nome - Nome da Comida.
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    
    /** 
     * Define uma imagem para a comida.
     * @return String - Imagem da Comida.
     */
    public String getImagem() {
        return imagem;
    }

    
    /** 
     * Define a imagem da comida.
     * @param imagem - Imagem da Comida.
     */
    public void setImagem(String imagem) {
        this.imagem = imagem;
    }
}
