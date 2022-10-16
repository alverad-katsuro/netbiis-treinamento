package com.curso3.unidade3;

public interface IDAO <T> {
    public void gravarCliente(T cliente);
    public void gravarProduto(T[] produto);
    public void gravarPedido(T pedido);
}
