package com.lojavirtuall.controle;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.lojavirtuall.dao.CursoDAO;
import com.lojavirtuall.model.Curso;

@WebServlet("/curso")
public class CursoServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession();
        int codigo = Integer.parseInt(req.getParameter("codigo"));
        Curso curso = CursoDAO.findCurso_byID(codigo);
        session.setAttribute("curso", curso);
        resp.sendRedirect("cursos/resultado.jsp");
    }


    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession();
        if (req.getParameter("isPut").equals("true")) {
            int codigo = Integer.parseInt(req.getParameter("codigo"));
            Curso curso = CursoDAO.findCurso_byID(codigo);
            
            curso.setCursoNome(req.getParameter("nome"));
            curso.setCursoDescricao(req.getParameter("descricao"));	
            curso.setCursoValor(Double.parseDouble(req.getParameter("valor").replace(",", ".")));
            CursoDAO.updateCurso(curso);
            session.setAttribute("curso", curso);
            resp.sendRedirect("cursos/resultado.jsp");
        } else {
            if (req.getParameter("isDelete").equals("true")) {
                int codigo = Integer.parseInt(req.getParameter("codigo"));
                CursoDAO.deleteCurso(codigo);
                resp.sendRedirect("cursos/index.jsp");
            } else {
                Curso curso = new Curso();
                curso.setCursoNome(req.getParameter("nome"));
                curso.setCursoDescricao(req.getParameter("descricao"));	
                curso.setCursoValor(Double.parseDouble(req.getParameter("valor").replace(",", ".")));
                CursoDAO.createCurso(curso);
                session.setAttribute("curso", curso);
                resp.sendRedirect("cursos/resultado.jsp");    
            }
        }
    }
}
