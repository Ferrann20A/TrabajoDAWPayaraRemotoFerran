<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Vista final</title>
    </head>
    <body>
        <h1>Listado de Ciudades</h1>
        <c:out value="${excepcion}"></c:out>
        <!-- <c:if test="${empty listaCiudades}">
            <h1>No se han encontrado paises</h1>
        </c:if> -->
            
            <table border = "2">
                <thead>
                    <tr>
                    <th>Código</th>
                    <th>Nombre</th>
                    <th>Continente</th>
                    <th>Region</th>
                    <th>Población</th>
                </tr>
                </thead>
                <c:forEach items="${listaCiudades}" var="pais">
                    <tr>
                        <td><c:out value="${pais.code}"></c:out></td>
                        <td><c:out value="${pais.name}"></c:out></td>
                        <td><c:out value="${pais.continent}"></c:out></td>
                        <td><c:out value="${pais.region}"></c:out></td>
                        <td><c:out value="${pais.poblation}"></c:out></td>
                    </tr>
                </c:forEach>
            </table>

    </body>
</html>
