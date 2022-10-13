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


    public boolean addProduto(String nome){
        Produto produto = Produto.achaProduto(nome);
        if (produto != null) {
            getProdutos().add(produto);
            return true;
        } else {
            return false;
        }
    }

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

    public void RemoveProduto(Produto produto){
        getProdutos().remove(produto);
    }

    public boolean RemoveProduto(String nome){
        Produto produto = Produto.achaProduto(nome);
        if (produto != null) {
            getProdutos().remove(produto);
            return true;
        } else {
            return false;
        }
    }

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

    public boolean cancelarCompra(){
        setProdutos(new ArrayList<Produto>());
        return true;
    }
}
