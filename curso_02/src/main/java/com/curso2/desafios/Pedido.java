package com.curso2.desafios;

import java.util.ArrayList;

public class Pedido {
    private static ArrayList<Pedido> pedidos = new ArrayList<Pedido>();
    private static int idAllPedido = 0;
    private int idPedido;
    private int idCliente;
    private ArrayList<Produto> produtos = new ArrayList<Produto>();
    private float valorTotal = 0;
    private String formaPagamento;
    private String observacao;


    public Pedido(int idCliente, String formaPagamento, String observacao) {
        this.idCliente = Pedido.getIdAllPedido();
        Pedido.setIdAllPedido(Pedido.getIdAllPedido() + 1);
        this.formaPagamento = formaPagamento;
        this.observacao = observacao;
    }

    public void listarPedido(){
        for (Pedido pedido : pedidos) {
            System.out.println(pedido);
        }
    }

    
    public Produto consultarProduto(String nome_produto){
        for (Produto produto : produtos) {
            if (produto.getNomeProduto().equals(nome_produto)) {
                System.out.println(produto);
                return produto;
            }
        }
        return null;
    }

    public boolean concluirPedido(){
        return true;
    }    

    public boolean adicionarProduto(Produto produto) {
        if (this.produtos.add(produto)){
            setValorTotal(getValorTotal() + produto.getPreco());
            return true;
        } else {
            return false;
        }
    }
    public boolean removerProduto(Produto produto) {
        if (this.produtos.remove(produto)) {
            setValorTotal(getValorTotal() - produto.getPreco());
            return true;
        } else {
            return false;
        }
    }

    public static boolean cancelarPedido(Pedido pedido){
        return Pedido.pedidos.remove(pedido);
    }

    @Override
    public String toString() {
        return "Pedido [idPedido=" + idPedido + ", idCliente=" + idCliente + ", produtos=" + produtos + ", valorTotal="
                + valorTotal + ", formaPagamento=" + formaPagamento + ", observacao=" + observacao + "]";
    }

    public static int getIdAllPedido() {
        return idAllPedido;
    }
    public static void setIdAllPedido(int idAllPedido) {
        Pedido.idAllPedido = idAllPedido;
    }
    public int getIdPedido() {
        return idPedido;
    }
    public void setIdPedido(int idPedido) {
        this.idPedido = idPedido;
    }
    public int getIdCliente() {
        return idCliente;
    }
    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }
    public float getValorTotal() {
        return valorTotal;
    }
    public void setValorTotal(float valorTotal) {
        this.valorTotal = valorTotal;
    }
    public String getFormaPagamento() {
        return formaPagamento;
    }
    public void setFormaPagamento(String formaPagamento) {
        this.formaPagamento = formaPagamento;
    }
    public String getObservacao() {
        return observacao;
    }
    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }
    public ArrayList<Produto> getProdutos() {
        return produtos;
    }
    public void setProdutos(ArrayList<Produto> produtos) {
        this.produtos = produtos;
    }
    
    public static ArrayList<Pedido> getPedidos() {
        return pedidos;
    }

    public static void setPedidos(ArrayList<Pedido> pedidos) {
        Pedido.pedidos = pedidos;
    }

    public static void addPedido(Pedido pedido){
        getPedidos().add(pedido);
    }

    
}
