package com.netbiis.sisrestaurante;

public class WasabiApp {
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

    public static void addProduto(String nome, Sacola sacola){
        sacola.addProduto(nome);
    }

    public static void addProduto(String nome, int quantidade, Sacola sacola){
        sacola.addProduto(nome, quantidade);
    }

    public static void removerProduto(String nome, Sacola sacola){
        sacola.RemoveProduto(nome);
    }

    public static void finalizarCompra(Cliente cliente, Sacola sacola){
        sacola.finalizarCompra(cliente);
    }

    public static void cancelarCompra(Sacola sacola){
        sacola.cancelarCompra();
    }

    public static void maisUm(String nome){
        Produto produto = Produto.achaProduto(nome);
        if (produto != null) {
            produto.maisUm();
        }
    }

    public static void menosUm(String nome){
        Produto produto = Produto.achaProduto(nome);
        if (produto != null) {
            produto.menosUm();
        }
    }
    
}
