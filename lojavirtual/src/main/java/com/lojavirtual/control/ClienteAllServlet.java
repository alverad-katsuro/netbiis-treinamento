package com.lojavirtual.control;

import java.io.IOException;

import com.lojavirtual.dao.ClienteDAO;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet(urlPatterns = { "/clientes/todos" })
public class ClienteAllServlet extends HttpServlet {
    
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        System.out.println("clienteall");
        session.setAttribute("clientes", ClienteDAO.readClientes());
        request.getRequestDispatcher("/clientes/todos.jsp").forward(request, response);   
    }
}
