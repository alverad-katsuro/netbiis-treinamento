package com.lojavirtuall.controle;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.lojavirtuall.dao.ClienteDAO;

@WebServlet(urlPatterns = { "/clientes/all" })
public class ClienteAllServlet extends HttpServlet {
    
    private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        System.out.println("clienteall");
        session.setAttribute("clientes", ClienteDAO.readClientes());
        request.getRequestDispatcher("/clientes/consultaTodos.jsp").forward(request, response);   
    }
}
