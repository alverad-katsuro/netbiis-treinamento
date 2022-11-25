<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

  <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <html>

    <head>
      <meta charset="UTF-8">
      <meta name="viewport" content="width=device-width, initial-scale=1">
      <script type="text/javascript" src="../assets/js/jquery.min.js"></script>
      <script type="text/javascript" src="../assets/js/bootstrap.min.js"></script>
      <link href="../assets/css/font-awesome.min.css" rel="stylesheet" type="text/css">
      <link href="../assets/css/bootstrap.css" rel="stylesheet" type="text/css">
      <link href="../assets/css/padrao.css" rel="stylesheet" type="text/css">
    </head>

    <body>
      <jsp:include page="../shared/navbar.jsp"></jsp:include>
      <div class="section section-danger text-justify">
        <div class="container">
          <div class="row text-center">
            <div class="col-md-12 text-center">
              <h1 class="text-center">Sistema de Gerenciamento de Cursos</h1>
            </div>
          </div>
        </div>
      </div>
      <div class="section section-danger text-justify">
        <div class="container">
          <div class="row text-center">
            <div class="col-md-12 text-center">
              <h3 class="text-center">Cliente ID: ${pagamento.cliente.clienteId}</h3>
              <h3 class="text-center">Curso ID: ${pagamento.curso.cursoId}</h3>
              <h3 class="text-center">Valor do Pago: ${pagamento.curso.cursoValor}</h3>
              <h3 class="text-center">Data da Compra: ${pagamento.pedidoData}</h3>
            </div>
          </div>
        </div>
      </div>
      <div class="section">
        <div class="container">
          <div class="row">
            <div class="col-md-12 text-center corrigir">
              <a class="btn btn-default" href="index.jsp">Retornar ao menu pagamentos</a>
            </div>
          </div>
        </div>
      </div>
      <footer>
        <div class="navbar navbar-fixed-bottom bgred">
          <div class="container">
            <div class="row">
              <div class="col-sm-12 text-center" style="top:13px;color:#fff;">� ABCTreinamentos - Curso de Java 8 para
                Web</div>
            </div>
          </div>
        </div>
      </footer>


    </body>

    </html>