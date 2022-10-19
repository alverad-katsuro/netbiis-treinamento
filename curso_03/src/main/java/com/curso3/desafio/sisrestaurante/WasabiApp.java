package com.curso3.desafio.sisrestaurante;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
* Classe com o restaurante de sushi
* @author Alfredo Gabriel
* @version 1.0
* @since 13/10/2022
*/
public class WasabiApp {
    public static Map<Cliente, ArrayList<Sacola>> venda = new HashMap<Cliente, ArrayList<Sacola>>();
    
    /** 
     * Função main que chama as demais funções para testes
     * @param args sem utilizade
     */
    public static void main(String[] args) {
        Comida generica = new Comida("Camarão", "Alguma descricao", 140, "null");
        new Hall_Wassabi("wassabi", generica);
        new Entrada("entrada", generica);
        new Temaki_Especial("temaki", generica);
        new Promocao("promocao", generica);

        Cliente cliente_um = new Cliente("Alfredo", "12345678912", "91999999999", "Rua dos Pariquis", "1234 1234 1234 1234");
        
        Sacola sacola = new Sacola();
        WasabiApp.addProduto("wassabi", 2, sacola);
        WasabiApp.finalizarCompra(cliente_um, sacola);
    }

    
    /** 
     * Função responsavel por adicionar o produto com determinado nome a uma sacola
     * @param nome
     * @param sacola
     */
    public static void addProduto(String nome, Sacola sacola){
        sacola.addProduto(nome);
    }

    
    /** 
     * Função responsavel por adicionar o produto com determinado nome a uma sacola e uma quantidade especifica
     * @param nome
     * @param quantidade
     * @param sacola
     */
    public static void addProduto(String nome, int quantidade, Sacola sacola){
        sacola.addProduto(nome, quantidade);
    }

    
    /** 
     * Função que ira remover um produto apos encontra-lo através de seu nome
     * @param nome
     * @param sacola
     */
    public static void removerProduto(String nome, Sacola sacola){
        sacola.RemoveProduto(nome);
    }

    
    /** 
     * Função responsavel por finalizar a compra de um cliente exibindo a forma de pagamento e os produtos bem como o endereço do cliente
     * @param cliente
     * @param sacola
     */
    public static void finalizarCompra(Cliente cliente, Sacola sacola){
        sacola.finalizarCompra(cliente);
        if (venda.containsKey(cliente)) {
            ArrayList<Sacola> pedidos = venda.get(cliente);
            pedidos.add(sacola);
            venda.put(cliente, pedidos);
            
        } else {
            ArrayList<Sacola> pedidos = new ArrayList<>();
            pedidos.add(sacola);
            venda.put(cliente, pedidos);
        }
    }

    
    /** 
     * Função responsavel por cancelar a compra ao redefinir os produtos da sacola
     * @param sacola
     */
    public static void cancelarCompra(Sacola sacola){
        sacola.cancelarCompra();
    }

    
    /** 
     * Incrementa a quantidade de um determinado produto na sacola.
     * @param nome
     */
    public static void maisUm(String nome){
        Produto produto = Produto.achaProduto(nome);
        if (produto != null) {
            produto.maisUm();
        }
    }

    
    /** 
     * Decrementa a quantidade de um determinado produto na sacola.
     * @param nome
     */
    public static void menosUm(String nome){
        Produto produto = Produto.achaProduto(nome);
        if (produto != null) {
            produto.menosUm();
        }
    }
    
}
