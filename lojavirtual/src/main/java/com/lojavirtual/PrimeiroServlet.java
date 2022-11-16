package com.lojavirtual;

import java.io.IOException;

import com.lojavirtual.dao.ClienteDAO;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet(description = "Este é o nosso primeiro servlet!", urlPatterns = { "/teste" })
public class PrimeiroServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    
    public PrimeiroServlet() {
        super();
    }
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        session.setAttribute("clientes", ClienteDAO.readClientes());
        request.getRequestDispatcher("/teste.jsp").forward(request, response);
        
        
    }
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {}
}