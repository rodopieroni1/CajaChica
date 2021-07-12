<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" 
              rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" 
              crossorigin="anonymous">
        <title>ABML</title>
    </head>

    <body>
        <div class="container mt-4">
            <div class="card border-info">
                <div class="card-header bg-info text-white">
                    <a  class="btn btn-primary" href="agregar.htm">Ingresar</a>
                </div>
                <div class="card-body">
                    <table class="table table-hover" >
                        <thead>
                            <tr>
                                <th>Descripcion</th>
                                <th>Responsable</th>
                                <th>Fecha</th>
                                <th>N° Caja</th>
                                <th>Reposicion</th>
                                <th>Saldo</th>
                                <th>Total</th>
                            </tr>
                        </thead>
                        <tbody>
                            <c:forEach var="datos" items="${lista}">
                            <tr>
                                <td>${datos.Descripcion}</td>
                                <td>${datos.Fecha}</td>
                                <td>${datos.CodOperario}</td>
                                <td>${datos.NumCaja}</td>
                                <td>${datos.Reposicion}</td>
                                <td>${datos.Saldo}</td>
                                <td>${datos.TotEgres}</td>
                                <td>
                                    <a class="btn btn-warning">Editar</a>
                                    <a class="btn btn-warning">Delete</a>
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
