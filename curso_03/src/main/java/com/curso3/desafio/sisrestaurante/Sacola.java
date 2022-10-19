package com.curso3.desafio.sisrestaurante;

import java.util.ArrayList;
/**
* Categoria que compõem o menu.
* @author Alfredo Gabriel
* @version 1.0
* @since 13/10/2022
*/
public class Sacola {
    public ArrayList<Produto> produtos = new ArrayList<Produto>();

    
    
    public Sacola() {
    }
    
    /** 
     * Retorna a lista com os produtos na sacola.
     * @return ArrayList<Produto> - Objeto.
     */
    public ArrayList<Produto> getProdutos() {
        return produtos;
    }

    
    /** 
     * Sobreescreve a lista de produtos na sacola.
     * @param produtos - Objeto.
     */
    public void setProdutos(ArrayList<Produto> produtos) {
        this.produtos = produtos;
    }

    
    /** 
     * Adiciona um produto x a sacola.
     * @param produto - Objeto.
     */
    public void addProduto(Produto produto){
        getProdutos().add(produto);
    }


    
    /** 
     * Adiciona um produto x na sacola através do nome dele.
     * @param nome - Nome do Objeto.
     * @return boolean - confirmação
     */
    public boolean addProduto(String nome){
        Produto produto = Produto.achaProduto(nome);
        if (produto != null) {
            getProdutos().add(produto);
            return true;
        } else {
            return false;
        }
    }

    
    /** 
     * Adiciona uma quantidade Z do produto X na sacola através do nome dele.
     * @param nome
     * @param quantidade
     * @return boolean
     */
    public boolean addProduto(String nome, int quantidade){
        Produto produto = Produto.achaProduto(nome);
        if (produto != null) {
            produto.setQuantidade(quantidade);
            getProdutos().add(produto);
            return true;
        } else {
            return false;
        }
    }

    
    /** 
     * Remove um produto X da sacola.
     * @param produto
     */
    public void RemoveProduto(Produto produto){
        getProdutos().remove(produto);
    }

    
    /** 
     * Remove um produto X da sacola através de seu nome.
     * @param nome
     * @return boolean
     */
    public boolean RemoveProduto(String nome){
        Produto produto = Produto.achaProduto(nome);
        if (produto != null) {
            getProdutos().remove(produto);
            return true;
        } else {
            return false;
        }
    }

    
    /** 
     * Finaliza a compra do cliente exibindo seus dados, os produtos na sacola e redefine e retira todos os itens da sacola.
     * @param cliente
     * @return boolean
     */
    public boolean finalizarCompra(Cliente cliente){
        if (this.produtos.size() > 0) {
            float preco_final = 0;
            System.out.printf("Cliente: %s\n", cliente.getNome());
            System.out.printf("CPF: %s\n", cliente.getCPF());
            System.out.printf("Telefone: %s\n", cliente.getTelefone());
            System.out.printf("Endereco: %s\n", cliente.getEndereco());
            System.out.printf("Forma de pagamento -> cartão: %s\n", cliente.getNum_cartao());
            System.out.println("Os pedidos são: ");
            for (Produto produto : produtos) {
                System.out.println(produto);
                if (produto instanceof Hall_Wassabi) {
                    preco_final += produto.getQuantidade() * ((Hall_Wassabi)produto).getComida().getPreco();
                } else if (produto instanceof Entrada){
                    preco_final += produto.getQuantidade() * ((Entrada)produto).getComida().getPreco();
                } else if (produto instanceof Promocao){
                    preco_final += produto.getQuantidade() * ((Promocao)produto).getComida().getPreco();
                } else if (produto instanceof Temaki_Especial){
                    preco_final += produto.getQuantidade() * ((Temaki_Especial)produto).getComida().getPreco();
                }
            }
            System.out.println("O preço pago foi de " + preco_final);
            setProdutos(new ArrayList<Produto>());
            return true;
        } else {
            return false;
        }
    }

    
    /** 
     * Cancela compra retirando todos os itens da sacola.
     * @return boolean
     */
    public boolean cancelarCompra(){
        setProdutos(new ArrayList<Produto>());
        return true;
    }
}
