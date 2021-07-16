<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
        <title>ABML</title>
    </head>

    <body>
        <div class="container mt-4">
            <div class="card border-info">
                <div class="card-header bg-info text-white">
                    <a class="btn btn-primary" href="agregar.htm"> Nuevo Registro<a/>
                </div>
                <div class="card-body">
                    <table border="1" class="table table-hover">
                        <thead>
                            <tr>
                                <th>ID</th>
                                <th>Descripcion</th>
                                <th>Fecha</th>
                                <th>Responsable</th>
                                <th>Numero de Caja</th>
                                <th>Reposicion</th>
                                <th>Saldo</th>
                                <th>Total</th>
                            </tr>
                        </thead>
                        <tbody>
                            <c:forEach var="dato" items="${lista}">
                            <tr>
                                <td>${dato.idCaja}</td>
                                <td>${dato.Descripcion}</td>
                                <td>${dato.Fecha}</td>
                                <td>${dato.NumCaja}</td>
                                <td>${dato.Reposicion}</td>
                                <td>${dato.Saldo}</td>
                                <td>${dato.TotEgres}</td>
                                <td>
                                    <a href="editar.htm?id=${dato.idCaja}" class="btn btn-warning">Editar</a>
                                    <a href="eliminar.htm?id=${dato.idCaja}" class="btn btn-danger">Eliminar</a>
                                </td>
                            </tr>
                            </c:forEach>
                        </tbody>
                    </table>
                </div>
            </div>
        </div>
    </body>
</html>
