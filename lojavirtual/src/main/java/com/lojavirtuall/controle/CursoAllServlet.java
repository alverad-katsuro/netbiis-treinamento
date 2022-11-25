package com.lojavirtuall.controle;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.lojavirtuall.dao.CursoDAO;

@WebServlet(urlPatterns = { "/cursos/all" })
public class CursoAllServlet extends HttpServlet {
    
    private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        session.setAttribute("cursos", CursoDAO.readCursos());
        request.getRequestDispatcher("/cursos/consultaTodos.jsp").forward(request, response);   
    }
}
