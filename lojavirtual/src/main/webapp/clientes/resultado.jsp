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
            <link href="../assets/css/bulma.min.css" rel="stylesheet" type="text/css">
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
            <div class="container" style="margin-left:20%;margin-right:20%;">
                <div class="section">
                    <div class="container">
                        <div class="field is-grouped is-grouped-centered">
                            <div style="margin-right: 10%;">
                                <label class="label">Nome</label>
                                <div class="control is-expanded">
                                    <p class="text-center">${cliente.clienteNome}</p>
                                </div>
                            </div>
                            <div>
                                <label class="label">Sobrenome</label>
                                <div class="control is-expanded">
                                    <p class="text-center">${cliente.clienteSobrenome}</p>
                                </div>
                            </div>
                        </div>
                        <div class="field">
                            <label class="label">CPF</label>
                            <div class="control">
                                <p class="text-center">${cliente.clienteCpf}</p>
                            </div>
                        </div>

                        <div class="field">
                            <label class="label">Telefone</label>
                            <div class="control">
                                <p class="text-center">${cliente.clienteTelefone}</p>
                            </div>
                        </div>

                        <div class="field">
                            <label class="label">Email</label>
                            <div class="control">
                                <p class="text-center">${cliente.clienteEmail}</p>
                            </div>
                        </div>




                    </div>
                </div>

            </div>
            <footer>
                <div class="navbar navbar-fixed-bottom bgred">
                    <div class="container">
                        <div class="row">
                            <div class="col-sm-12 text-center" style="top:13px;color:#fff;">© ABCTreinamentos - Curso de
                                Java 8
                                para Web</div>
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