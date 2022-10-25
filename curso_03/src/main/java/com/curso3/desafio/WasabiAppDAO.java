package com.curso3.desafio;

import com.curso3.unidade3.IDAO;
import com.curso3.unidade3.netbiis.sisrestaurante.Comida;
import com.curso3.unidade3.netbiis.sisrestaurante.Cliente;
import com.curso3.unidade3.netbiis.sisrestaurante.Entrada;
import com.curso3.unidade3.netbiis.sisrestaurante.Hall_Wassabi;
import com.curso3.unidade3.netbiis.sisrestaurante.Produto;
import com.curso3.unidade3.netbiis.sisrestaurante.Promocao;
import com.curso3.unidade3.netbiis.sisrestaurante.Sacola;
import com.curso3.unidade3.netbiis.sisrestaurante.Temaki_Especial;

/**
* Classe com o restaurante de sushi
* @author Alfredo Gabriel
* @version 1.0
* @since 13/10/2022
*/
public class WasabiAppDAO<T> implements IDAO<T> {
    
    /** 
     * Função main que chama as demais funções para testes
     * @param args sem utilizade
     */
    public static void main(String[] args) {
        WasabiAppDAO<Object> loja = new WasabiAppDAO<>();
        Comida generica = new Comida("Camarão", "Alguma descricao", 140, "null");
        new Hall_Wassabi("wassabi", generica);
        new Entrada("entrada", generica);
        new Temaki_Especial("temaki", generica);
        new Promocao("promocao", generica);
        loja.gravarProduto(Entrada.getEntradas().toArray(new Entrada[Entrada.getEntradas().size()]));
        loja.gravarProduto(Hall_Wassabi.getWassabis().toArray(new Hall_Wassabi[Hall_Wassabi.getWassabis().size()]));
        loja.gravarProduto(Temaki_Especial.getTemaki().toArray(new Temaki_Especial[Temaki_Especial.getTemaki().size()]));
        loja.gravarProduto(Promocao.getPromocoes().toArray(new Promocao[Promocao.getPromocoes().size()]));
        
        
        Cliente cliente_um = new Cliente("Alfredo", "12345678912", "91999999999", "Rua dos Pariquis", "1234 1234 1234 1234");
        loja.gravarCliente(cliente_um);
        
        Sacola sacola = new Sacola();
        WasabiAppDAO.addProduto("wassabi", 2, sacola);
        loja.gravarPedido(sacola);
        WasabiAppDAO.finalizarCompra(cliente_um, sacola);
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


    @Override
    public void gravarCliente(T cliente) {
        System.out.println("Gravando " + cliente.toString());
        
    }
    
    
    @Override
    public void gravarProduto(T[] produto) {
        System.out.println("Gravando " + produto);
    }
    
    
    @Override
    public void gravarPedido(T pedido) {
        System.out.println("Gravando " + pedido);
        
    }
    
}
