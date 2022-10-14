package com.curso2.unidade3;

public class Cliente {
    private static int idAllClient = 0;
    private int idClient;
    private String cpf;
    private String nome;
    private String cnh;

    public Cliente(){
        idClient = getIdAllClient();
        Cliente.setIdAllClient(idClient++);
    }

    public Cliente(String nome, String cpf, String cnh){
        idClient = getIdAllClient();
        Cliente.setIdAllClient(idClient++);
        this.cpf = cpf;
        this.nome = nome;
        this.cnh = cnh;
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
    public String getCnh() {
        return cnh;
    }
    
    /** 
     * @param cnh
     */
    public void setCnh(String cnh) {
        this.cnh = cnh;
    }    
}
