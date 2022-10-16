package com.curso3.unidade4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
@SuppressWarnings("rawtypes")
public class LojaVirtual {
    Map pagamento = new HashMap<Cliente, List<Curso>>();

    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        LojaVirtual loja = new LojaVirtual();

        List cursos = new ArrayList<Curso>();
        cursos.add(new Curso("Prog 1", "Prog 1", 160, "www.google.com"));
        cursos.add(new Curso("Prog 2", "Prog 2", 160, "www.google.com"));
        cursos.add(new Curso("Prog 3", "Prog 3", 160, "www.google.com"));
        cursos.add(new Curso("Prog 4", "Prog 4", 160, "www.google.com"));
        cursos.add(new Curso("Prog 5", "Prog 5", 160, "www.google.com"));
        Cliente3 cliente = new Cliente3("0000000000", "Alfredo", "amgabriel1@hotmmail.com");

        loja.pagamento(cliente, cursos);

    }

    @SuppressWarnings("unchecked")
    public void pagamento(Cliente3 cliente, List<Curso> curso){
        pagamento.put(cliente, curso);
    }
}
