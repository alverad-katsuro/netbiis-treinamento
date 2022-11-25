package com.lojavirtuall.controle;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.lojavirtuall.dao.ClienteDAO;
import com.lojavirtuall.model.Cliente;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
    
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.sendRedirect("login.jsp");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession();
        String email = req.getParameter("email");
	    String password = req.getParameter("password");
        System.out.println(email);
        System.out.println(password);
        Cliente cli = ClienteDAO.findCliente_byEmail(email);
        if (cli.getClienteSenha().equals(password)) {
			session.setAttribute("login", "true");
			resp.sendRedirect("index.jsp");
        } else {
			session.setAttribute("login", "false");
			resp.sendRedirect("login.jsp");
        }
    }
}
