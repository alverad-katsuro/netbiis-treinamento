package com.backend;

public class Curso {
    private String nome;
    private String descricao;
    private float valor;
    private String url;
    private int id;
    static public int ID_ALL = 0;
 
    public Curso(String nome, String descricao, float valor, String url) {
        this.id = Curso.getID_ALL() + 1;
        Curso.setID_ALL(Cliente.getID_ALL() + 1);
        this.nome = nome;
        this.descricao = descricao;
        this.valor = valor;
        this.url = url;
    }
    public static int getID_ALL() {
        return Curso.ID_ALL;
    }

    public static void setID_ALL(int i) {
        Curso.ID_ALL = i;
    }

    @Override
    public String toString() {
        return "Curso [nome=" + nome + ", descricao=" + descricao + ", valor=" + valor + ", url=" + url + ", id=" + id
                + "]";
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
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
