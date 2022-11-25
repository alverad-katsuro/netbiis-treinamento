<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
  <html>

  <head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <script type="text/javascript" src="../assets/js/jquery.min.js"></script>
    <script type="text/javascript" src="../assets/js/bootstrap.min.js"></script>
    <script type="text/javascript" src="../assets/js/mascara.js"></script>
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
            <h3 class="tt_menu">&gt;&gt; CURSOS - ALTERAR CURSO &lt;&lt;</h3>
          </div>
        </div>
        <div class="row">
          <div class="col-md-12">
            <form class="form-horizontal" role="form" action="http://localhost:8080/LojaVirtual/curso" method="post">
              <div class="form-group">
                <div class="col-sm-2">
                  <label for="inputCURSO" class="control-label">Informar o curso:</label>
                </div>
                <div class="col-sm-10">
                  <input type="number" min="1" name="codigo" class="form-control" id="inputCURSO"
                    placeholder="C�digo do Curso" title="Digite o c�digo do curso" required>
                </div>
              </div>
              <div class="form-group">
                <div class="col-sm-2">
                  <label for="inputNome" class="control-label">Informar o nome:</label>
                </div>
                <div class="col-sm-10">
                  <input type="text" name="nome" class="form-control" id="inputNome" placeholder="Nome"
                    title="Digite o nome do curso" required>
                </div>
              </div>
              <div class="form-group">
                <div class="col-sm-2">
                  <label for="inputVALOR" class="control-label">Informar o VALOR:</label>
                </div>
                <div class="col-sm-10">
                  <input type="text" name="valor" class="form-control" id="inputVALOR" placeholder="R$ 12,34"
                    title="Digite um valor no formato 12,34" onchange="javascript:mascara(this, formataMonetario)"
                    required>
                </div>
              </div>
              <div class="form-group">
                <div class="col-sm-2">
                  <label for="inputSITE" class="control-label">Informar a descrição do curso</label>
                </div>
                <div class="col-sm-10">
                  <textarea name="descricao" id="descricao" placeholder="Descrição" cols="30" rows="10"></textarea>
                </div>
              </div>
              <input type="hidden" name="isDelete" value="false">
              <input type="hidden" name="isPut" value="true">
              <button type="submit" class="btn btn-danger">Alterar</button>
            </form>
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
            <div class="col-sm-12 text-center" style="top:13px;color:#fff;">� ABCTreinamentos - Curso de Java 8 para Web
            </div>
          </div>
        </div>
      </div>
    </footer>


  </body>

  </html>