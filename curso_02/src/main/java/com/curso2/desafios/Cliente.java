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
    
    
    /** 
     * @param pedido
     */
    public void fazerPedido(Pedido pedido){
        Pedido.addPedido(pedido);
    }

    
    /** 
     * @param produto
     * @return Pedido
     */
    public Pedido fazerPedido(Produto produto){
        Pedido pedido = new Pedido(getIdClient(), "Avista", "NA");
        pedido.adicionarProduto(produto);
        return pedido;
    }
    
    
    /** 
     * @param pedido
     */
    public void cancelarPedido(Pedido pedido){
        Pedido.cancelarPedido(pedido);
    }

    
    /** 
     * @return String
     */
    @Override
    public String toString() {
        return "Cliente [idClient=" + idClient + ", email=" + email + ", nome=" + nome + ", endereco=" + endereco
                + ", telefone=" + telefone + "]";
    }

    
    /** 
     * @return int
     */
    public static int getIdAllClient() {
        return idAllClient;
    }

    
    /** 
     * @param idAllClient
     */
    public static void setIdAllClient(int idAllClient) {
        Cliente.idAllClient = idAllClient;
    }
    
    /** 
     * @return int
     */
    public int getIdClient() {
        return idClient;
    }
    
    /** 
     * @param idClient
     */
    public void setIdClient(int idClient) {
        this.idClient = idClient;
    }
    
    /** 
     * @return String
     */
    public String getEmail() {
        return email;
    }

    
    /** 
     * @param email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    
    /** 
     * @return String
     */
    public String getNome() {
        return nome;
    }
    
    /** 
     * @param nome
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    
    /** 
     * @return String
     */
    public String getEndereco() {
        return endereco;
    }

    
    /** 
     * @param endereco
     */
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    
    /** 
     * @return String
     */
    public String getTelefone() {
        return telefone;
    }

    
    /** 
     * @param telefone
     */
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}
