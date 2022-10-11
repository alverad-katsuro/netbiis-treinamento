package com.curso2.desafios;

public class Cliente {
    private static int idAllClient = 0;
    private int idClient;
    private String email;
    private String nome;
    private String endereco;
    private String telefone;

    public Cliente(){
        idClient = getIdAllClient();
        Cliente.setIdAllClient(idClient++);
    }
 
    public Cliente(String nome, String email, String endereco, String telefone){
        idClient = getIdAllClient();
        Cliente.setIdAllClient(idClient++);
        this.email = email;
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
    }
    
    public void fazerPedido(Pedido pedido){
        Pedido.addPedido(pedido);
    }

    public Pedido fazerPedido(Produto produto){
        Pedido pedido = new Pedido(getIdClient(), "Avista", "NA");
        pedido.adicionarProduto(produto);
        return pedido;
    }
    
    public void cancelarPedido(Pedido pedido){
        Pedido.cancelarPedido(pedido);
    }

    @Override
    public String toString() {
        return "Cliente [idClient=" + idClient + ", email=" + email + ", nome=" + nome + ", endereco=" + endereco
                + ", telefone=" + telefone + "]";
    }

    public static int getIdAllClient() {
        return idAllClient;
    }

    public static void setIdAllClient(int idAllClient) {
        Cliente.idAllClient = idAllClient;
    }
    public int getIdClient() {
        return idClient;
    }
    public void setIdClient(int idClient) {
        this.idClient = idClient;
    }
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}
