<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
 pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Edit Fornitore</title>
<link rel="stylesheet"
 href="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
<script
 src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script
 src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
<script
 src="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"></script>
</head>
<a class="btn btn-light" href="http://localhost:8086/menu/List"
 role="button">Home</a>
<a class="btn btn-light"
 href="http://localhost:8086/Fornitore/ListaFornitori" role="button">Indietro</a>
<body>
 <div class="container">
  <spring:url value="/Fornitore/SaveFornitore/" var="saveURL" />
  <h2>Add Edit Fornitore</h2>
  <form:form modelAttribute="oFornitore" method="post" action="${saveURL}" cssClass="form">
   <form:hidden path="idfornitore" />
   <div class="form-group">
    <label>RagioneSociale</label>
    <form:input path="ragioneSociale" cssClass="form-control" id="ragioneSociale" />
    <form:errors path="ragioneSociale" cssClass="error" />
   </div>
   <div class="form-group">
    <label>Indirizzo</label>
    <form:input path="indirizzo" cssClass="form-control" id="indirizzo" />
    <form:errors path="indirizzo" cssClass="error" />
   </div>
   <div class="form-group">
    <label>Città</label>
    <form:input path="citta" cssClass="form-control" id="citta" />
    <form:errors path="citta" cssClass="error" />
   </div>
   <div class="form-group">
    <label>Cap</label>
    <form:input path="cap" cssClass="form-control" id="cap" />
    <form:errors path="cap" cssClass="error" />
   </div>
   <div class="form-group">
    <label>Provincia</label>
    <form:input path="provincia" cssClass="form-control" id="provincia" />
    <form:errors path="provincia" cssClass="error" />
   </div>
   <div class="form-group">
    <label>PartitaIva</label>
    <form:input path="partitaIva" cssClass="form-control" id="partitaIva" />
    <form:errors path="partitaIva" cssClass="error" />
   </div>
   <button type="submit" class="btn btn-primary">Salva</button>
  </form:form>
 </div>
</body>
</html>