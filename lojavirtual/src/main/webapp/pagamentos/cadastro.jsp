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
            <h3 class="tt_menu">&gt;&gt; PAGAMENTOS - CADASTRAR PAGAMENTO &lt;&lt;</h3>
          </div>
        </div>
        <div class="row">
          <div class="col-md-12">
            <form class="form-horizontal" role="form" action="http://localhost:8080/LojaVirtual/pagamento"
              method="post">
              <div class="form-group">
                <div class="col-sm-3">
                  <label for="inputCpf" class="control-label">Informar o Código do Cliente</label>
                </div>
                <div class="col-sm-9">
                  <input type="text" min="1" name="clienteId" class="form-control" placeholder="Código do Cliente" required>
                </div>
              </div>
              <div class="form-group">
                <div class="col-sm-3">
                  <label for="inputCURSO" class="control-label">Informar o código do Curso</label>
                </div>
                <div class="col-sm-9">
                  <input type="number" min="1" name="cursoId" class="form-control" 
                  placeholder="Código do curso" required>
                </div>
              </div>
              <div class="form-group">
                <div class="col-sm-3">
                  <label for="inputDATA" class="control-label">Informar a data de inscrição:</label>
                </div>
                <div class="col-sm-9">
                  <input type="date" name="pedidoData" class="form-control" title="Preencha o campo data"
                    required>
                </div>
              </div>
              <input type="hidden" name="isDelete" value="false">
              <input type="hidden" name="isPut" value="false">
              <button type="submit" class="btn btn-danger">Cadastrar</button>
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