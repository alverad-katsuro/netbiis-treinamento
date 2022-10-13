package com.netbiis.sisrestaurante;

public sealed abstract class Produto permits Hall_Wassabi, Temaki_Especial, Promocao, Entrada {
    protected int quantidade = 1;
    protected String nome;

    
    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public void maisUm(){
        this.quantidade = this.quantidade + 1;
    }

    public boolean menosUm(){
        if (this.quantidade > 0) {
            this.quantidade = this.quantidade - 1;
            return true;
        } else {
            return false;
        }
    }

    public static void listarProduto(){
        Hall_Wassabi.listaWassabis();
        Temaki_Especial.listaTemaki();
        Promocao.listaPromocoes();
        Entrada.listarEntradas();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Produto [quantidade=" + quantidade + ", nome=" + nome + "]";
    }

    public static Produto achaProduto(String nome){
        Produto produto;
        produto = Hall_Wassabi.getWassabi(nome);
        if (produto != null) {
            return produto;
        } else{
            produto = Entrada.getEntrada(nome);
            if (produto != null) {
                return produto;
            } else {
                produto = Promocao.getPromocao(nome);
                if (produto != null) {
                    return produto;
                } else {
                    produto = Temaki_Especial.getTemaki_Especial(nome);
                    if (produto != null) {
                        return produto;
                    } else {
                        System.out.println("Não encontrado");
                        return null;
                    }
                }
            }
        }
    }
    
}
