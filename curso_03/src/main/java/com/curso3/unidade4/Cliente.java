package com.curso3.unidade4;

import java.util.Map;
import java.util.HashMap;

public class Cliente implements Comparable<Cliente>{
    private String nome;
    Map<Integer, Curso> cursos = new HashMap<Integer, Curso>();
    
    Cliente(String nome){
        this.nome = nome;
    }

    public static void main(String[] args) {
        Cliente cliente = new Cliente("Alfredo");
        cliente.addCurso(1, new Curso("Prog 1", "Prog 1", 150, "wwww.google.com"));
        cliente.addCurso(2, new Curso("Prog 2", "Prog 2", 150, "wwww.google.com"));
        cliente.addCurso(3, new Curso("Prog 3", "Prog 3", 150, "wwww.google.com"));
        cliente.addCurso(4, new Curso("Prog 4", "Prog 4", 150, "wwww.google.com"));
        cliente.addCurso(5, new Curso("Prog 5", "Prog 5", 150, "wwww.google.com"));

        System.out.println(cliente.getCursos());
    }

    public void addCurso(Integer chave, Curso curso){
        this.cursos.put(chave, curso);
    }

    public void removeCurso(int chave){
        this.cursos.remove(chave);
    }

    public Curso consultaCurso(int chave){
        return this.cursos.get(chave);
    }

    public Map<Integer, Curso> getCursos() {
        return cursos;
    }

    public void setCursos(Map<Integer, Curso> cursos) {
        this.cursos = cursos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public int compareTo(Cliente cliente){
        if (this.getNome() == null || cliente.getNome() == null) {
            return 0;
        }
        return getNome().compareTo(cliente.getNome());
    }
    

}
