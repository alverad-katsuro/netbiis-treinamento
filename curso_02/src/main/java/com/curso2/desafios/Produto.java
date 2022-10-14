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

    
    /** 
     * @param nome_produto
     * @return Produto
     */
    public static Produto consultarProduto(String nome_produto){
        for (Produto produto : produtos) {
            if (produto.getNomeProduto().equals(nome_produto)) {
                System.out.println(produto);
                return produto;
            }
        }
        return null;
    }
    

    
    /** 
     * @return String
     */
    @Override
    public String toString() {
        return "Produto [idProduto=" + idProduto + ", nomeProduto=" + nomeProduto + ", preco=" + preco + ", peso="
                + peso + ", qtdDisponivel=" + qtdDisponivel + "]";
    }


    
    /** 
     * @param quantidade
     */
    public void adicionarEstoque(int quantidade){
        setQtdDisponivel(getQtdDisponivel() + quantidade);
    }

    
    /** 
     * @param quantidade
     */
    public void removeEstoque(int quantidade){
        adicionarEstoque(-quantidade);
    }

    
    /** 
     * @return int
     */
    public static int getIdAllProduto() {
        return idAllProduto;
    }

    
    /** 
     * @param idAllProduto
     */
    public static void setIdAllProduto(int idAllProduto) {
        Produto.idAllProduto = idAllProduto;
    }

    
    /** 
     * @return int
     */
    public int getIdProduto() {
        return idProduto;
    }

    
    /** 
     * @return ArrayList<Produto>
     */
    public static ArrayList<Produto> getProdutos() {
        return produtos;
    }


    
    /** 
     * @param produtos
     */
    public static void setProdutos(ArrayList<Produto> produtos) {
        Produto.produtos = produtos;
    }

    
    /** 
     * @param produto
     */
    public static void addProduto(Produto produto){
        Produto.produtos.add(produto);
    }

    public static void listarProduto(){
        for (Produto produto : produtos) {
            System.out.println(produto);
        }
    }




    
    /** 
     * @param idProduto
     */
    public void setIdProduto(int idProduto) {
        this.idProduto = idProduto;
    }

    
    /** 
     * @return int
     */
    public int consultarDisponibilidade(){
        return getQtdDisponivel();
    }

    
    /** 
     * @return String
     */
    public String getNomeProduto() {
        return nomeProduto;
    }
    
    /** 
     * @param nomeProduto
     */
    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }
    
    /** 
     * @return ImageIO
     */
    public ImageIO getImagem() {
        return imagem;
    }
    
    /** 
     * @param imagem
     */
    public void setImagem(ImageIO imagem) {
        this.imagem = imagem;
    }
    
    /** 
     * @return float
     */
    public float getPreco() {
        return preco;
    }
    
    /** 
     * @param preco
     */
    public void setPreco(float preco) {
        this.preco = preco;
    }
    
    /** 
     * @return float
     */
    public float getPeso() {
        return peso;
    }
    
    /** 
     * @param peso
     */
    public void setPeso(float peso) {
        this.peso = peso;
    }
    
    /** 
     * @return int
     */
    public int getQtdDisponivel() {
        return qtdDisponivel;
    }
    
    /** 
     * @param qtdDisponivel
     */
    public void setQtdDisponivel(int qtdDisponivel) {
        this.qtdDisponivel = qtdDisponivel;
    }

    
}
