<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
 pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Lista Aree</title>
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

  if (confirm("Eliminare l'area selezionata?")) {
   return true;
  } else {
   return false;
  }
 }
</script>

</head>
<a class="btn btn-light" href="http://localhost:8080/Archivio/Lista"
 role="button">Indietro</a>
<a class="btn btn-light" href="http://localhost:8080/Menu/List"
 role="button">Home</a>
<body>
 <div class="container">
  <h2>Lista Aree</h2>
  <table class="table table-striped">
   <thead>
  
    <th scope="row">Codice</th>
    <th scope="row">Area</th>
    <th></th>
    <th></th>
   </thead>
   <tbody>
    <c:forEach items="${elencoAree}" var="elenco">
     <tr>
      <td>${elenco.codice}</td>
      <td>${elenco.area}</td>
      <td><spring:url
        value="/Area/EditArea/${elenco.idarea}"
        var="editURL" /><a href="${editURL}" role="button"
       class="btn btn-primary">Modifica</a></td>
      <td><spring:url
        value="/Area/DeleteArea/${elenco.idarea}"
        var="deleteURL" /> <a href="${deleteURL}" role="button"
       class="btn btn-primary"
       onclick="return deleteConfirm()">Elimina</a>
      </td>
     </tr>
    </c:forEach>
   </tbody>
  </table>

  <spring:url value="/Area/AddArea/" var="addURL" />
  <a href="${addURL}" role="button" class="btn btn-primary">Nuova Area</a>
 </div>
</body>