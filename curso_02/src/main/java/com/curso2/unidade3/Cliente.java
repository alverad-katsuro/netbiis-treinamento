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
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCnh() {
        return cnh;
    }
    public void setCnh(String cnh) {
        this.cnh = cnh;
    }    
}
