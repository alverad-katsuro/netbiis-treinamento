package com.curso3;

public class Curso {
    private String nome;
    private String descricao;
    private float valor;
    private String url;
 
    public Curso(String nome, String descricao, float valor, String url) {
        this.nome = nome;
        this.descricao = descricao;
        this.valor = valor;
        this.url = url;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public float getValor() {
        return valor;
    }
    public void setValor(float valor) {
        this.valor = valor;
    }
    public String getUrl() {
        return url;
    }
    public void setUrl(String url) {
        this.url = url;
    }

    
}
