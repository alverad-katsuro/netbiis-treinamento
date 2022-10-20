package com.curso3.unidade5;

import java.util.HashSet;
import java.util.Set;
import java.util.function.Consumer;

import com.curso3.unidade4.Curso;

public class Cliente2 {
    private String nome;
    Set<Curso> cursos = new HashSet<Curso>();
    
    Cliente2(String nome){
        this.nome = nome;
    }

    public static void main(String[] args) {
        Cliente2 cliente = new Cliente2("Alfredo");
        Cliente2 cliente2 = new Cliente2("Alfredoooooo");
        cliente.addCurso(new Curso("Prog 1", "Prog 1", 150, "wwww.google.com"));
        cliente.addCurso(new Curso("Prog 2", "Prog 2", 150, "wwww.google.com"));
        cliente.addCurso(new Curso("Prog 3", "Prog 3", 150, "wwww.google.com"));
        cliente.addCurso(new Curso("Prog 4", "Prog 4", 150, "wwww.google.com"));
        cliente.addCurso(new Curso("Prog 5", "Prog 5", 150, "wwww.google.com"));

        cliente2.addCurso(new Curso("Prog 4", "Prog 4", 150, "wwww.google.com"));
        cliente2.addCurso(new Curso("Prog 5", "Prog 5", 150, "wwww.google.com"));
        /* 
        System.out.println("Cursos feitos por " + cliente.getNome());
        System.out.println(cliente.getCursos());
        
        System.out.println("Cursos feitos por " + cliente2.getNome());
        System.out.println(cliente2.getCursos());
        
        cliente.getCursos().removeAll(cliente2.getCursos());
        
        System.out.println("Cursos feitos não feitos por " + cliente2.getNome());
        System.out.println(cliente.getCursos());
        
        cliente.getCursos().forEach(System.out::println);
        */
        Consumer<Set<Curso>> consumer = Cliente2::listarCurso;
        consumer.accept(cliente.getCursos());  
        listarCurso(cliente.getCursos());
    }

    public void addCurso(Curso curso){
        this.cursos.add(curso);
    }

    public Set<Curso> getCursos() {
        return cursos;
    }

    public void setCursos(Set<Curso> cursos) {
        this.cursos = cursos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public static void listarCurso(Set<Curso> cursos){
        cursos.forEach(x -> {
            System.out.println(x);
        });
    }
}
