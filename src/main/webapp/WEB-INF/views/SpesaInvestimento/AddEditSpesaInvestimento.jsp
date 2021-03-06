<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
 pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Edit Spesa Investimento</title>
<link rel="stylesheet"
 href="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
<script
 src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script
 src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
<script
 src="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"></script>
</head>
<a class="btn btn-light" href="http://localhost:8080/menu/List"
 role="button">Home</a>
<a class="btn btn-light"
 href="http://localhost:8080/SpesaInvestimento/ListaSpeseInvestimento" role="button">Indietro</a>
<body>
 <div class="container">
  <spring:url value="/SpesaInvestimento/SaveSpesaInvestimento/" var="saveURL" />
  <h2>Add Edit Area</h2>
  <form:form modelAttribute="oSpesaInvestimento" method="post" action="${saveURL}" cssClass="form">
   <form:hidden path="idspesainvestimento" />
   <div class="form-group">
    <label>Codice</label>
    <form:input path="spesaInvestimento" cssClass="form-control" id="spesaInvestimento" />
    <form:errors path="spesaInvestimento" cssClass="error" />
   </div>
   <div class="form-group">
    <label>Anno Contabile</label>
    <form:select path="osottocategoria" cssClass="form-control" id="osottocategoria">
     <form:option value="0">Seleziona una Sotto Categoria:</form:option>
     <form:options items="${elencoSottoCategorie}" itemValue="idsottocategoria" itemLabel="sottoCategoria" />
    </form:select>
       <form:errors path="osottocategoria" cssClass="error"/>
   </div>
   <button type="submit" class="btn btn-primary">Salva</button>
  </form:form>
 </div>
</body>
</html>