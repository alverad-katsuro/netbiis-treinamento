package com.netbiis.sisrestaurante;

import java.util.ArrayList;

public class Sacola {
    public ArrayList<Produto> produtos = new ArrayList<Produto>();

    public ArrayList<Produto> getProdutos() {
        return produtos;
    }

    public Sacola() {
    }


    public void setProdutos(ArrayList<Produto> produtos) {
        this.produtos = produtos;
    }

    public void addProduto(Produto produto){
        getProdutos().add(produto);
    }


    public void addProduto(String nome){
        Produto produto = Produto.achaProduto(nome);
        if (produto != null) {
            getProdutos().add(produto);
        }
    }

    public void addProduto(String nome, int quantidade){
        Produto produto = Produto.achaProduto(nome);
        if (produto != null) {
            produto.setQuantidade(quantidade);
            getProdutos().add(produto);
        }
    }

    public void RemoveProduto(Produto produto){
        getProdutos().remove(produto);
    }

    public boolean finalizarCompra(Cliente cliente){
        if (this.produtos.size() > 0) {
            System.out.printf("Cliente: %s\n", cliente.getNome());
            System.out.printf("CPF: %s\n", cliente.getCPF());
            System.out.printf("Telefone: %s\n", cliente.getTelefone());
            System.out.printf("Endereco: %s\n", cliente.getEndereco());
            System.out.printf("Forma de pagamento -> cartão: %s\n", cliente.getNum_cartao());
            System.out.println("Os pedidos são: ");
            for (Produto produto : produtos) {
                System.out.println(produto);
            }
            setProdutos(new ArrayList<Produto>());
            return true;
        } else {
            return false;
        }
    }

    public boolean cancelarCompra(){
        setProdutos(new ArrayList<Produto>());
        return true;
    }
}
