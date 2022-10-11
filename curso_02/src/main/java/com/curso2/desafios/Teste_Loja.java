package com.curso2.desafios;

public class Teste_Loja {
    public static void main(String[] args) {
        new Produto("Laranja", 15, 1, 10);
        new Produto("Goiaba", 150, 1, 10);
        new Produto("Caju", 115, 1, 10);
        new Produto("Pessego", 915, 1, 10);
        Produto.listarProduto();
        Cliente cliente = new Cliente("Alfredo", "amga@asdas", "Alguma rua", "9191949464");
        Pedido pedido_cliente = cliente.fazerPedido(Produto.consultarProduto("Laranja"));
        System.out.println(pedido_cliente);

    }
}
