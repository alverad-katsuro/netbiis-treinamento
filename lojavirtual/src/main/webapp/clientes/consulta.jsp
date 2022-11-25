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
                        <h3 class="tt_menu">&gt;&gt; CLIENTES - CONSULTAR CLIENTE &lt;&lt;</h3>
                    </div>
                </div>
                <div class="row">
                    <div class="col-md-12">
                        <form class="form-horizontal" role="form" action="http://localhost:8080/LojaVirtual/cliente"
                            method="get">
                            <div class="form-group">
                                <div class="col-sm-2">
                                    <label for="inputCpf" class="control-label">Informar o cpf:</label>
                                </div>
                                <div class="col-sm-10">
                                    <input type="text" name="cpf" class="form-control" id="inputCpf" placeholder="CPF"
                                        pattern="\d{3}\.\d{3}\.\d{3}-\d{2}"
                                        title="Digite um CPF no formato: xxx.xxx.xxx-xx" required>
                                </div>
                            </div>
                            <button type="submit" class="btn btn-danger">Consultar</button>
                        </form>
                    </div>
                </div>
            </div>
        </div>
        <footer>
            <div class="navbar navbar-fixed-bottom bgred">
                <div class="container">
                    <div class="row">
                        <div class="col-sm-12 text-center" style="top:13px;color:#fff;">� ABCTreinamentos - Curso de
                            Java 8 para Web</div>
                    </div>
                </div>
            </div>
        </footer>
        <div class="section">
            <div class="container">
                <div class="row">
                    <div class="col-md-12 text-center corrigir">
                        <a class="btn btn-default" href="javascript:window.history.go(-1)">Voltar</a>
                    </div>
                </div>
            </div>
        </div>


    </body>

    </html>