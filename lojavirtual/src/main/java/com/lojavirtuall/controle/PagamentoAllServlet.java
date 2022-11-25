package com.lojavirtuall.controle;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import com.lojavirtuall.dao.PagamentoDAO;

@WebServlet(urlPatterns = { "/pagamentos/all" })
public class PagamentoAllServlet extends HttpServlet {
    
    private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        session.setAttribute("pagamentos", PagamentoDAO.readPedidos());
        request.getRequestDispatcher("/pagamentos/consultaTodos.jsp").forward(request, response);   
    }
}
