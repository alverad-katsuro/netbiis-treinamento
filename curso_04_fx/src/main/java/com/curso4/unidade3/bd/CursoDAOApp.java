package com.curso4.unidade3.bd;

import java.sql.SQLException;
import java.util.List;

import com.curso4.unidade3.model.Curso;

public class CursoDAOApp {
    public static void main(String[] args) {
        Curso curso = new Curso("curso1", "Descricao", 150f, "url");
        Curso curso2 = new Curso("curso2", "Descricao", 150f, "url");
        CursoDAO cursodao = new CursoDAO();
        try {
            cursodao.create(curso);
            cursodao.inserirSP(curso2);
            List<Curso> cursos = cursodao.read();
            // Remove curso 1
            cursodao.delete(cursos.get(0));
            System.out.println(cursodao.read());
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
