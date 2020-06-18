<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
    <%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Menu</title>
<link rel="stylesheet"
 href="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
<script
 src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script
 src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
<script
 src="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"></script>
</head>
 <spring:url value="/Menu/List" var="addURL" />
  <a href="${addURL}" role="button" class="btn btn-primary">Indietro</a>
<body>
<div class="container" align="center">
<br><br><br><br><br>
  <h3>EuropCar</h3>
  <br>
  <div class="btn-group-vertical">
  	<a class="btn btn-primary" href="http://localhost:8080/Riconciliazione/Riconciliazione" role="button">Riconciliazione</a> 
    <a class="btn btn-secondary" href="http://localhost:8080/Definizione/Definizione" role="button">Definizione</a> 
  	<a class="btn btn-danger" href="http://localhost:8080/Avanzamento/Avanzamento" role="button">Avanzamento</a> 
  	<a class="btn btn-primary" href="http://localhost:8080/SpesaInvestimento/ListaSpeseInvestimento" role="button">Spesa Investimento</a>
  </div>
 </div>

</body>
</html>