<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
  <html>

  <head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <script type="text/javascript" src="http://localhost:8080/LojaVirtual/assets/js/jquery.min.js"></script>
    <link rel="icon" type="image/png" href="https://cdn.albertoroura.com/media/2014/05/html5_logo.png" />
    <script type="text/javascript" src="http://localhost:8080/LojaVirtual/assets/js/bootstrap.min.js"></script>
    <link href="http://localhost:8080/LojaVirtual/assets/css/font-awesome.min.css" rel="stylesheet" type="text/css">
    <link href="http://localhost:8080/LojaVirtual/assets/css/bootstrap.css" rel="stylesheet" type="text/css">
    <link href="http://localhost:8080/LojaVirtual/assets/css/padrao.css" rel="stylesheet" type="text/css">
    <link rel="stylesheet" href="http://localhost:8080/LojaVirtual/assets/css/bulma.min.css">
  </head>

  <body>
    <jsp:include page="shared/navbar.jsp"></jsp:include>

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
            <div class="col-md-12  btn-group btn-group-lg btn-group-vertical">
              <a href="clientes/index.jsp" class="btn btn-default">CLIENTES</a>
              <a href="cursos/index.jsp" class="btn btn-default">CURSOS</a>
              <a href="pagamentos/index.jsp" class="btn btn-default">PAGAMENTOS</a>
            </div>
          </div>
        </div>
      </div>
    </div>
    <div class="section">
      <div class="container">
        <div class="row">
          <div class="col-md-12 text-center corrigir">
            <a class="btn btn-default" href="http://localhost:8080/LojaVirtual/logout">Sair</a>
          </div>
        </div>
      </div>
    </div>
    <footer>
      <div class="navbar navbar-fixed-bottom bgred">
        <div class="container">
          <div class="row">
            <div class="col-sm-12 text-center" style="top:13px;color:#fff;">� ABCTreinamentos - Curso de Java 8 para Web
            </div>
          </div>
        </div>
      </div>
    </footer>


  </body>

  </html>