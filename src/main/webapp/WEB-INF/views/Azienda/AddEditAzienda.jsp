<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
 pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Edit Azienda</title>
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
 href="http://localhost:8086/Azienda/ListaAziende" role="button">Indietro</a>
<body>
 <div class="container">
  <spring:url value="/Azienda/SaveAzienda/" var="saveURL" />
  <h2>Add Edit Azienda</h2>
  <form:form modelAttribute="oAzienda" method="post" action="${saveURL}" cssClass="form">
   <form:hidden path="idazienda" />
   <div class="form-group">
    <label>ContractID</label>
    <form:input path="contractID" cssClass="form-control" id="contractID" />
    <form:errors path="contractID" cssClass="error" />
   </div>
   <div class="form-group">
    <label>Indirizzo</label>
    <form:input path="indirizzo" cssClass="form-control" id="indirizzo" />
    <form:errors path="indirizzo" cssClass="error" />
   </div>
   <div class="form-group">
    <label>RagioneSociale</label>
    <form:input path="ragioneSociale" cssClass="form-control" id="ragioneSociale" />
    <form:errors path="ragioneSociale" cssClass="error" />
   </div>
   <div class="form-group">
    <label>Gruppo</label>
    <form:select path="ogruppo" cssClass="form-control" id="ogruppo">
     <form:option value="0">Seleziona un Gruppo:</form:option>
     <form:options items="${elencoGruppi}" itemValue="idgruppo" itemLabel="nome" />
    </form:select>
       <form:errors path="ogruppo" cssClass="error"/>
   </div>
   <button type="submit" class="btn btn-primary">Salva</button>
  </form:form>
 </div>
</body>
</html>