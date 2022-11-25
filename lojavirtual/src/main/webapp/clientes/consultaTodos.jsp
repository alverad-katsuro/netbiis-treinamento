<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
  <%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

    <html>

    <head>
      <meta charset="UTF-8">
      <meta name="viewport" content="width=device-width, initial-scale=1">
      <script type="text/javascript" src="../assets/js/jquery.min.js"></script>
      <script type="text/javascript" src="../assets/js/bootstrap.min.js"></script>
      <link href="../assets/css/font-awesome.min.css" rel="stylesheet" type="text/css">
      <link href="../assets/css/bootstrap.css" rel="stylesheet" type="text/css">
      <link href="../assets/css/padrao.css" rel="stylesheet" type="text/css">
      <title>Página de Consulta - Todos os Clientes</title>
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
      <div class="section">
        <div class="container">
          <div class="row">
            <div class="col-md-12 text-center">
              <h3 class="tt_menu">&gt;&gt; CLIENTES - CONSULTAR TODOS OS CLIENTES &lt;&lt;</h3>
            </div>
          </div>
        </div>
      </div>
      <div class="section text-justify">
        <div class="container">
          <div class="row text-center">
            <div class="col-md-12 text-center">
              <table class="table">
                <thead>
                  <tr>
                    <th>NOME</th>
                    <th>SOBRENOME</th>
                    <th>CPF</th>
                    <th>TELEFONE</th>
                    <th>EMAIL</th>
                  </tr>
                </thead>
                <c:forEach var="c" items="${clientes}">
                  <tr>
                    <td>
                      <c:out value="${c.clienteNome}" />
                    </td>
                    <td>
                      <c:out value="${c.clienteSobrenome}" />
                    </td>
                    <td>
                      <c:out value="${c.clienteCpf}" />
                    </td>
                    <td>
                      <c:out value="${c.clienteTelefone}" />
                    </td>
                    <td>
                      <c:out value="${c.clienteEmail}" />
                    </td>
                  </tr>
                </c:forEach>
              </table>
            </div>
          </div>
        </div>
      </div>
      <div class="section">
        <div class="container">
          <div class="row">
            <div class="col-md-12 text-center">
              <a class="btn btn-default" href="javascript:window.history.go(-1)">Voltar</a>
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