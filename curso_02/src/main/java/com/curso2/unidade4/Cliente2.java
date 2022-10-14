package com.curso2.unidade4;

public class Cliente2 {
    private static int idAllClient = 0;
    private int idClient;
    private String cpf;
    private String nome;
    private String endereco;

    public Cliente2(){
        idClient = getIdAllClient();
        Cliente2.setIdAllClient(idClient++);
    }
 
    public Cliente2(String nome, String cpf, String endereco){
        idClient = getIdAllClient();
        Cliente2.setIdAllClient(idClient++);
        this.cpf = cpf;
        this.nome = nome;
        this.endereco = endereco;
    }
    
    
    /** 
     * @return String
     */
    @Override
    public String toString() {
        return "Cliente2 [idClient=" + idClient + ", cpf=" + cpf + ", nome=" + nome + ", endereco=" + endereco + "]";
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
        Cliente2.idAllClient = idAllClient;
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
    public String getCpf() {
        return cpf;
    }
    
    /** 
     * @param cpf
     */
    public void setCpf(String cpf) {
        this.cpf = cpf;
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
}
