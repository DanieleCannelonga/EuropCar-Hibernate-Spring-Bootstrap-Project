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
  	<a class="btn btn-primary" href="http://localhost:8080/AliquotaIva/ListaAliquoteIva" role="button">Gestione AliquoteIva</a> 
    <a class="btn btn-secondary" href="http://localhost:8080/SottoCategoria/ListaSottoCategorie" role="button">Gestione SottoCategorie</a> 
  	<a class="btn btn-danger" href="http://localhost:8080/Area/ListaAree" role="button">Gestione Aree d'Investimento</a>
  	<a class="btn btn-success" href="http://localhost:8080/Azienda/ListaAziende" role="button">Gestione Aziende</a> 
  	<a class="btn btn-info" href="http://localhost:8080/Budget/ListaBudget" role="button">Budget</a> 
  	<a class="btn btn-warning" href="http://localhost:8080/Gruppo/ListaGruppi" role="button">Gestione Gruppi</a> 
  	<a class="btn btn-primary" href="http://localhost:8080/Progetto/ListaProgetti" role="button">Gestione Progetti</a> 
  	<a class="btn btn-secondary" href="http://localhost:8080/Fornitore/ListaFornitori" role="button">Gestione Fornitori</a>
  </div>
 </div>

</body>
</html>