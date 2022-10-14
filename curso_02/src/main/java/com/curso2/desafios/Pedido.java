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

    
    
    /** 
     * @param nome_produto
     * @return Produto
     */
    public Produto consultarProduto(String nome_produto){
        for (Produto produto : produtos) {
            if (produto.getNomeProduto().equals(nome_produto)) {
                System.out.println(produto);
                return produto;
            }
        }
        return null;
    }

    
    /** 
     * @return boolean
     */
    public boolean concluirPedido(){
        return true;
    }    

    
    /** 
     * @param produto
     * @return boolean
     */
    public boolean adicionarProduto(Produto produto) {
        if (this.produtos.add(produto)){
            setValorTotal(getValorTotal() + produto.getPreco());
            return true;
        } else {
            return false;
        }
    }
    
    /** 
     * @param produto
     * @return boolean
     */
    public boolean removerProduto(Produto produto) {
        if (this.produtos.remove(produto)) {
            setValorTotal(getValorTotal() - produto.getPreco());
            return true;
        } else {
            return false;
        }
    }

    
    /** 
     * @param pedido
     * @return boolean
     */
    public static boolean cancelarPedido(Pedido pedido){
        return Pedido.pedidos.remove(pedido);
    }

    
    /** 
     * @return String
     */
    @Override
    public String toString() {
        return "Pedido [idPedido=" + idPedido + ", idCliente=" + idCliente + ", produtos=" + produtos + ", valorTotal="
                + valorTotal + ", formaPagamento=" + formaPagamento + ", observacao=" + observacao + "]";
    }

    
    /** 
     * @return int
     */
    public static int getIdAllPedido() {
        return idAllPedido;
    }
    
    /** 
     * @param idAllPedido
     */
    public static void setIdAllPedido(int idAllPedido) {
        Pedido.idAllPedido = idAllPedido;
    }
    
    /** 
     * @return int
     */
    public int getIdPedido() {
        return idPedido;
    }
    
    /** 
     * @param idPedido
     */
    public void setIdPedido(int idPedido) {
        this.idPedido = idPedido;
    }
    
    /** 
     * @return int
     */
    public int getIdCliente() {
        return idCliente;
    }
    
    /** 
     * @param idCliente
     */
    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }
    
    /** 
     * @return float
     */
    public float getValorTotal() {
        return valorTotal;
    }
    
    /** 
     * @param valorTotal
     */
    public void setValorTotal(float valorTotal) {
        this.valorTotal = valorTotal;
    }
    
    /** 
     * @return String
     */
    public String getFormaPagamento() {
        return formaPagamento;
    }
    
    /** 
     * @param formaPagamento
     */
    public void setFormaPagamento(String formaPagamento) {
        this.formaPagamento = formaPagamento;
    }
    
    /** 
     * @return String
     */
    public String getObservacao() {
        return observacao;
    }
    
    /** 
     * @param observacao
     */
    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }
    
    /** 
     * @return ArrayList<Produto>
     */
    public ArrayList<Produto> getProdutos() {
        return produtos;
    }
    
    /** 
     * @param produtos
     */
    public void setProdutos(ArrayList<Produto> produtos) {
        this.produtos = produtos;
    }
    
    
    /** 
     * @return ArrayList<Pedido>
     */
    public static ArrayList<Pedido> getPedidos() {
        return pedidos;
    }

    
    /** 
     * @param pedidos
     */
    public static void setPedidos(ArrayList<Pedido> pedidos) {
        Pedido.pedidos = pedidos;
    }

    
    /** 
     * @param pedido
     */
    public static void addPedido(Pedido pedido){
        getPedidos().add(pedido);
    }

    
}
