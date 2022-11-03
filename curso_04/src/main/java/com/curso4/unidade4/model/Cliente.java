package com.curso4.unidade4.model;

public class Cliente implements java.io.Serializable {
    private int clienteId;
    private String clienteNome;
    private String clienteSobrenome;
    private String clienteEmail;
    private String clienteTelefone;
    private String clienteCpf;

    public Cliente(String nome, String sobrenome, String email, String telefone, String CPF) {
        this.clienteNome = nome;
        this.clienteSobrenome = sobrenome;
        this.clienteEmail = email;
        this.clienteTelefone = telefone;
        this.clienteCpf = CPF;
    }

    public Cliente(int id, String nome, String sobrenome, String email, String telefone, String CPF) {
        this.clienteId = id;
        this.clienteNome = nome;
        this.clienteSobrenome = sobrenome;
        this.clienteEmail = email;
        this.clienteTelefone = telefone;
        this.clienteCpf = CPF;
    }

    

    @Override
    public String toString() {
        return "Cliente [clienteId=" + clienteId + ", clienteNome=" + clienteNome + ", clienteSobrenome="
                + clienteSobrenome + ", clienteEmail=" + clienteEmail + ", clienteTelefone=" + clienteTelefone
                + ", clienteCpf=" + clienteCpf + "]";
    }

    public int getClienteId() {
        return clienteId;
    }

    public void setClienteId(int clienteId) {
        this.clienteId = clienteId;
    }

    public String getClienteNome() {
        return clienteNome;
    }

    public void setClienteNome(String clienteNome) {
        this.clienteNome = clienteNome;
    }

    public String getClienteSobrenome() {
        return clienteSobrenome;
    }

    public void setClienteSobrenome(String clienteSobrenome) {
        this.clienteSobrenome = clienteSobrenome;
    }

    public String getClienteEmail() {
        return clienteEmail;
    }

    public void setClienteEmail(String clienteEmail) {
        this.clienteEmail = clienteEmail;
    }

    public String getClienteTelefone() {
        return clienteTelefone;
    }

    public void setClienteTelefone(String clienteTelefone) {
        this.clienteTelefone = clienteTelefone;
    }

    public String getClienteCpf() {
        return clienteCpf;
    }

    public void setClienteCpf(String clienteCpf) {
        this.clienteCpf = clienteCpf;
    }

    
}
