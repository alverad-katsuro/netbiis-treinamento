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
            <h3 class="tt_menu">&gt;&gt; PAGAMENTOS &lt;&lt;</h3>
            <div class="col-md-12  btn-group btn-group-lg btn-group-vertical">
              <a href="http://localhost:8080/LojaVirtual/pagamentos/all"
                class="btn btn-default">Consultar Todos os Pagamentos</a>
              <a href="consulta.jsp" class="btn btn-default">Consultar um Pagamento Específico</a>
              <a href="cadastro.jsp" class="btn btn-default">Cadastrar um Novo Pagamento</a>
              <a href="alteracao.jsp" class="btn btn-default">Alterar um Pagamento</a>
              <a href="exclusao.jsp" class="btn btn-default">Excluir um Pagamento</a>
            </div>
          </div>
        </div>
      </div>
    </div>
    <div class="section">
      <div class="container">
        <div class="row">
          <div class="col-md-12 text-center corrigir">
            <a class="btn btn-default" href="javascript:window.history.go(-1)">Voltar</a>
          </div>
        </div>
      </div>
    </div>
    <footer>
      <div class="navbar navbar-fixed-bottom bgred">
        <div class="container">
          <div class="row">
            <div class="col-sm-12 text-center" style="top:13px;color:#fff;">ABCTreinamentos - Curso de Java 8 para Web
            </div>
          </div>
        </div>
      </div>
    </footer>


  </body>

  </html>