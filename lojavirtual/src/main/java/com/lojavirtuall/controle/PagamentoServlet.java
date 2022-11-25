package com.lojavirtuall.controle;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.lojavirtuall.dao.PagamentoDAO;
import com.lojavirtuall.model.Pedido;
import com.lojavirtuall.model.PedidoId;

@WebServlet("/pagamento")
public class PagamentoServlet extends HttpServlet {

    public static void main(String[] args) throws ParseException {
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println(format.parse("18/07/2022"));
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession();
        int cli = Integer.parseInt(req.getParameter("clienteId"));
        int cur = Integer.parseInt(req.getParameter("cursoId"));
        Pedido pedido = PagamentoDAO.findPedido_by_CliCur(cli, cur);
        session.setAttribute("pagamento", pedido);
        resp.sendRedirect("pagamentos/resultado.jsp");
    }


    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession();
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        if (req.getParameter("isPut").equals("true")) {
            int cli = Integer.parseInt(req.getParameter("clienteId"));
            int cur = Integer.parseInt(req.getParameter("cursoId"));
            Pedido pedido = PagamentoDAO.findPedido_by_CliCur(cli, cur);
            String data = req.getParameter("pedidoData");
            try {
                pedido.setPedidoData(format.parse(data));
            } catch (ParseException e) {
                e.printStackTrace();
            }
            PagamentoDAO.updatePedido(pedido);
            session.setAttribute("pagamento", pedido);
            resp.sendRedirect("pagamentos/resultado.jsp");
        } else {
            if (req.getParameter("isDelete").equals("true")) {
                int cli = Integer.parseInt(req.getParameter("clienteId"));
                int cur = Integer.parseInt(req.getParameter("cursoId"));
                PagamentoDAO.deletePedido(new PedidoId(cli, cur));
                resp.sendRedirect("pagamentos/index.jsp");
            } else {
                Pedido pedido = new Pedido();
                int cli = Integer.parseInt(req.getParameter("clienteId"));
                int cur = Integer.parseInt(req.getParameter("cursoId"));
                String data = req.getParameter("pedidoData");
                pedido.setId(new PedidoId(cli, cur));
                try {
                    pedido.setPedidoData(format.parse(data));
                } catch (ParseException e) {
                    e.printStackTrace();
                }
                PagamentoDAO.createPedido(pedido);
                pedido = PagamentoDAO.findPedido_byID(pedido.getId());
                session.setAttribute("pagamento", pedido);
                resp.sendRedirect("pagamentos/resultado.jsp");    
            }
        }
    }
}
