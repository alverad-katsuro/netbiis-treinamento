<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
            pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.List, com.lojavirtual.model.Cliente, java.io.IOException" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="icon" type="image/png" href="https://cdn.albertoroura.com/media/2014/05/html5_logo.png"/>
    <title>Document</title>
</head>
<body>
    <c:forEach var="row" items="${clientes}">
        <tr>
            <td><c:out value="${row.clienteNome}" /></td>
        </tr>
    </c:forEach>
</body>
</html>