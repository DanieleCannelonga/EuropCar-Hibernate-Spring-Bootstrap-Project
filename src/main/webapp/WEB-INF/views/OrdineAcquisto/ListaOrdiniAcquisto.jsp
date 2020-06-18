<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
 pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Lista Ordini Acquisto</title>
<link rel="stylesheet"
 href="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
<script
 src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script
 src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
<script
 src="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"></script>

<script type="text/javascript">
 function deleteConfirm() {

  if (confirm("Eliminare l'ordine d'acquisto selezionato?")) {
   return true;
  } else {
   return false;
  }
 }
</script>

</head>
<a class="btn btn-light" href="http://localhost:8080/OrdineAcquisto/Lista"
 role="button">Indietro</a>
<a class="btn btn-light" href="http://localhost:8080/Menu/List"
 role="button">Home</a>
<body>
 <div class="container">
  <h2>Lista Ordini Acquisto</h2>
  <table class="table table-striped">
  <form:form modelAttribute="oggettoFornitore" method="post" action="${saveURL}" cssClass="form">
   <div class="form-group">
    <label>Fornitore</label>
    <form:select path="idfornitore" cssClass="form-control" id="idfornitore">
     <form:option value="0">Seleziona un Fornitore:</form:option>
     <form:options items="${elencoFornitori}" itemValue="idfornitore" itemLabel="ragioneSociale" />
    </form:select>
       <form:errors path="idfornitore" cssClass="error"/>
   </div>
  </form:form>
   <thead>
   <spring:url value="/OrdineAcquisto/CercaOrdiniAcquistoPerFornitore/" var="addURL" />
   <a href="${addURL}" role="button" class="btn btn-primary">Cerca</a>
  
  <c:if test="${elencoOrdiniAcquisto.size() == 0}">
   <table class="table table-striped">
    <thead>
     <th scope="row">Non ci sono ordini di acquisto!</th>
    </thead>
   </table>
      <spring:url value="/OrdineAcquisto/AddOrdineAcquisto" var="addURL" />
     <a href="${addURL}" role="button" class="btn btn-primary">Nuovo Ordine Acquisto</a>
  </c:if>
  
  <c:if test="${elencoOrdiniAcquisto.size() != 0}">
   <table class="table table-striped">
    <thead>
     <th scope="row">Importo</th>
     <th scope="row">Ordine Acquisto</th>
     <th scope="row">Data</th>
     <th scope="row">Fornitore</th>
     <th></th>
     <th></th>
    </thead>
    <tbody>
     <c:forEach items="${elencoOrdiniAcquisto}" var="elenco">
      <tr>
       <td>${elenco.importo}</td>
       <td>${elenco.ordineAcquisto}</td>
       <td>${elenco.data}</td>
       <td>${elenco.ofornitore.ragioneSociale}</td>
       <td><spring:url
        value="/OrdineAcquisto/EditOrdineAcquisto/${elenco.idordineacquisto}"
        var="editURL" /><a href="${editURL}" role="button"
        class="btn btn-primary">Modifica</a>
       </td>
       <td><spring:url
        value="/OrdineAcquisto/DeleteOrdineAcquisto/${elenco.idordineacquisto}"
        var="deleteURL" /> <a href="${deleteURL}" role="button"
       class="btn btn-primary"
       onclick="return deleteConfirm()">Elimina</a>
      </td>
     </tr>
    </c:forEach>
   </tbody>
   </table>
   <spring:url value="/OrdineAcquisto/AddOrdineAcquisto" var="addURL" />
   <a href="${addURL}" role="button" class="btn btn-primary">Nuovo Ordine Acquisto</a>
  </c:if>
 </table>
</div>
</body>
</html>
    