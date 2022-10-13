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
        sacola.addProduto("wassabi");

        sacola.finalizarCompra(cliente_um);
    }
    
}
