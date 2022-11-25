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

@WebServlet("/cliente")
public class ClienteServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession();
        String cpf = req.getParameter("cpf");
        Cliente cli = ClienteDAO.findCliente_byCPF(cpf);
        session.setAttribute("cliente", cli);
        resp.sendRedirect("clientes/resultado.jsp");
    }


    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession();
        if (req.getParameter("isPut").equals("true")) {
            String email = req.getParameter("email");

            Cliente cliente = ClienteDAO.findCliente_byEmail(email);
            
            cliente.setClienteCpf(req.getParameter("cpf"));
            cliente.setClienteNome(req.getParameter("nome"));	
            cliente.setClienteSobrenome(req.getParameter("sobrenome"));	
            cliente.setClienteTelefone(req.getParameter("telefone"));	
            cliente.setClienteSenha(req.getParameter("password"));	
            ClienteDAO.updateCliente(cliente);
            session.setAttribute("cliente", cliente);
            resp.sendRedirect("clientes/resultado.jsp");
        } else {
            if (req.getParameter("isDelete").equals("true")) {
                String cpf = req.getParameter("cpf");
                Cliente cli = ClienteDAO.findCliente_byCPF(cpf);
                ClienteDAO.deleteCliente(cli.getClienteId());
                resp.sendRedirect("clientes/index.jsp");
            } else {
                String cpf = req.getParameter("cpf");					
                String nome = req.getParameter("nome");
                String sobrenome = req.getParameter("sobrenome");
                String telefone = req.getParameter("telefone");
                String email = req.getParameter("email");
                String password = req.getParameter("password");
                Cliente cliente = new Cliente(nome, sobrenome, telefone, cpf, email, password);
                ClienteDAO.createCliente(cliente);
                session.setAttribute("cliente", cliente);
                resp.sendRedirect("clientes/resultado.jsp");    
            }
        }
    }
}
