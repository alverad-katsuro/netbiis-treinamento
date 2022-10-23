package com.backend;

public class Cliente {
    public static int ID_ALL = 0;
    private int id;
    private String nome;
    private String sobrenome;
    private String email;
    private String telefone;
    private String CPF;

    public Cliente(String nome, String sobrenome, String email, String telefone, String CPF) {
        this.id = Cliente.getID_ALL() + 1;
        Cliente.setID_ALL(Cliente.getID_ALL() + 1);
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.email = email;
        this.telefone = telefone;
        this.CPF = CPF;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    @Override
    public String toString() {
        return "Cliente [nome=" + nome + ", sobrenome=" + sobrenome + ", CPF=" + CPF + "]";
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public static int getID_ALL() {
        return ID_ALL;
    }

    public static void setID_ALL(int iD_ALL) {
        ID_ALL = iD_ALL;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

}
