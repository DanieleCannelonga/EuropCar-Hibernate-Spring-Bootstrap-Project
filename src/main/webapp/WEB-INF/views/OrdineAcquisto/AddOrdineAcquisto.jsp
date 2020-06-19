<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
 pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Edit Ordine Acquisto</title>
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
 href="http://localhost:8080/OrdineAcquisto/ListaOrdiniAcquisto" role="button">Indietro</a>
<body>
 <div class="container">
  <spring:url value="/OrdineAcquisto/SaveOrdineAcquisto/" var="saveURL" />
  <h2>Add Edit Area</h2>
  <form:form modelAttribute="oOrdineAcquisto" method="post" action="${saveURL}" cssClass="form">
   <form:hidden path="idordineacquisto" />
   <div class="form-group">
    <label>Importo</label>
    <form:input path="importo" cssClass="form-control" id="importo" />
    <form:errors path="importo" cssClass="error" />
   </div>
   <div class="form-group">
    <label>Ordine Acquisto</label>
    <form:input path="ordineAcquisto" cssClass="form-control" id="ordineAcquisto" />
    <form:errors path="ordineAcquisto" cssClass="error" />
   </div>
   <div class="form-group">
    <label>Data</label>
    <form:input path="data" cssClass="form-control" id="data" />
    <form:errors path="data" cssClass="error" />
   </div>
   <div class="form-group">
    <label>Fornitore</label>
    <form:select path="ofornitore" cssClass="form-control" id="ofornitore">
     <form:option value="0">Seleziona un Fornitore:</form:option>
     <form:options items="${elencoFornitori}" itemValue="idfornitore" itemLabel="ragioneSociale" />
    </form:select>
       <form:errors path="ofornitore" cssClass="error"/>
   </div>
   <button type="submit" class="btn btn-primary">Salva</button>
  </form:form>
 </div>
</body>
</html>