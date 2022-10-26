package com.curso3.desafio;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.curso3.unidade4.Cliente3;
import com.curso3.unidade4.Curso;
@SuppressWarnings("rawtypes")
public class LojaVirtual {
    Map<Cliente3, List<Curso>> pagamento = new HashMap<Cliente3, List<Curso>>();

    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        LojaVirtual loja = new LojaVirtual();

        List cursos = new ArrayList<Curso>();
        List cursos2 = new ArrayList<Curso>();
        cursos.add(new Curso("Prog 1", "Prog 1", 160, "www.google.com"));
        cursos.add(new Curso("Prog 2", "Prog 2", 160, "www.google.com"));
        cursos.add(new Curso("Prog 3", "Prog 3", 160, "www.google.com"));
        cursos.add(new Curso("Prog 4", "Prog 4", 160, "www.google.com"));
        cursos.add(new Curso("Prog 5", "Prog 5", 160, "www.google.com"));


        cursos2.add(new Curso("Prog 5", "Prog 5", 16000, "www.google.com"));

        List<Cliente3> clientes = new ArrayList();
        clientes.add(new Cliente3("111111","Alfredo", "aaa@aaaa"));
        clientes.add(new Cliente3("0","BAlfredo", "aaa@aaaa"));
        
        loja.pagamento(clientes.get(0), cursos);
        
        loja.listarCursos(cursos);
        loja.pagamento(clientes.get(1), cursos2);
        loja.ordernar("B");
        loja.lucro();
        loja.gasto();
    }

    public void listarCursos(List<Curso> cursos){
        cursos.forEach(System.out::println);
    }

    public void pagamento(Cliente3 cliente, List<Curso> curso){
        pagamento.put(cliente, curso);
    }

    public void ordernar(String letra){
        pagamento.keySet().stream().filter((Cliente3 c) -> c.nome().startsWith(letra)).sorted(Comparator.comparing(Cliente3::nome)).forEach(System.out::println);
    }

    public void gasto(){
        Map<Float, Cliente3> ordem = new HashMap<Float, Cliente3>();
        for (Map.Entry<Cliente3, List<Curso>> par : pagamento.entrySet()) {
            if (ordem.containsKey(gasto(par.getValue()))) {
                ordem.put((gasto(par.getValue()) + 0.01f), par.getKey());
            } else {
                ordem.put(gasto(par.getValue()), par.getKey());
            }
        }

        ordem.keySet().stream().sorted(Comparator.comparing(Float::floatValue).reversed()).forEach(x-> System.out.println(ordem.get(x)));
    }

    public static float teste(Cliente3 cliente, List<Curso> cursos){
        float gasto = gasto(cursos);

        return gasto;
    }

    public static float gasto(List<Curso> cursos){
        float gasto = 0;
        for (Curso curso : cursos) {
            gasto += curso.valor();
        }
        return gasto;
    }

    public void lucro(){
        float lucro = 0;
        for (Map.Entry<Cliente3, List<Curso>> par : pagamento.entrySet()) {
            for (Curso curso : par.getValue()) {
                lucro += curso.valor();
            }
        }
        System.out.println(String.format("O luclo é %.2f", lucro));
    }

}
