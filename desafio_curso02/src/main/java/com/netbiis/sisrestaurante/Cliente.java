package com.netbiis.sisrestaurante;

public class Cliente {
    private String nome;
    private String CPF;
    private String telefone;
    private String endereco;
    private String num_cartao;

    
    public Cliente(String nome, String CPF, String telefone, String endereco, String num_cartao) {
        this.nome = nome;
        this.CPF = CPF;
        this.telefone = telefone;
        this.endereco = endereco;
        this.num_cartao = num_cartao;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCPF() {
        return CPF;
    }
    public void setCPF(String cPF) {
        CPF = cPF;
    }
    public String getTelefone() {
        return telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    public String getNum_cartao() {
        return num_cartao;
    }
    public void setNum_cartao(String num_cartao) {
        this.num_cartao = num_cartao;
    }
}
