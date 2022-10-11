package com.curso2.desafios;

import java.util.ArrayList;

import javax.imageio.ImageIO;

public class Produto {
    private static ArrayList<Produto> produtos = new ArrayList<Produto>();
    private static int idAllProduto = 0;
    private int idProduto;
    private String nomeProduto;
    private ImageIO imagem;
    private float preco;
    private float peso;
    private int qtdDisponivel;

    
    
    public Produto(String nomeProduto, float preco, float peso, int qtdDisponivel) {
        this.idProduto = Produto.getIdAllProduto();
        Produto.setIdAllProduto(Produto.getIdAllProduto() + 1);
        this.nomeProduto = nomeProduto;
        this.preco = preco;
        this.peso = peso;
        this.qtdDisponivel = qtdDisponivel;
        Produto.addProduto(this);
    }

    public static Produto consultarProduto(String nome_produto){
        for (Produto produto : produtos) {
            if (produto.getNomeProduto().equals(nome_produto)) {
                System.out.println(produto);
                return produto;
            }
        }
        return null;
    }
    

    @Override
    public String toString() {
        return "Produto [idProduto=" + idProduto + ", nomeProduto=" + nomeProduto + ", preco=" + preco + ", peso="
                + peso + ", qtdDisponivel=" + qtdDisponivel + "]";
    }


    public void adicionarEstoque(int quantidade){
        setQtdDisponivel(getQtdDisponivel() + quantidade);
    }

    public void removeEstoque(int quantidade){
        adicionarEstoque(-quantidade);
    }

    public static int getIdAllProduto() {
        return idAllProduto;
    }

    public static void setIdAllProduto(int idAllProduto) {
        Produto.idAllProduto = idAllProduto;
    }

    public int getIdProduto() {
        return idProduto;
    }

    public static ArrayList<Produto> getProdutos() {
        return produtos;
    }


    public static void setProdutos(ArrayList<Produto> produtos) {
        Produto.produtos = produtos;
    }

    public static void addProduto(Produto produto){
        Produto.produtos.add(produto);
    }

    public static void listarProduto(){
        for (Produto produto : produtos) {
            System.out.println(produto);
        }
    }




    public void setIdProduto(int idProduto) {
        this.idProduto = idProduto;
    }

    public int consultarDisponibilidade(){
        return getQtdDisponivel();
    }

    public String getNomeProduto() {
        return nomeProduto;
    }
    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }
    public ImageIO getImagem() {
        return imagem;
    }
    public void setImagem(ImageIO imagem) {
        this.imagem = imagem;
    }
    public float getPreco() {
        return preco;
    }
    public void setPreco(float preco) {
        this.preco = preco;
    }
    public float getPeso() {
        return peso;
    }
    public void setPeso(float peso) {
        this.peso = peso;
    }
    public int getQtdDisponivel() {
        return qtdDisponivel;
    }
    public void setQtdDisponivel(int qtdDisponivel) {
        this.qtdDisponivel = qtdDisponivel;
    }

    
}
