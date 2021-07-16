<%-- 
    Document   : editar
    Created on : 16/07/2021, 11:10:39
    Author     : Propietario
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" 
              rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
        <title>Agregar Caja</title>
    </head>
    <body>
        <div class="container mt-4 col-lg-4">
            <div class="card border-info">
                <div class="card-header bg-info">
                    <h4>Actualizar Caja Chica</h4>                    
                </div>
                <div class="card-body">
                    <form method="POST">
                        <label>Descripcion</label>
                        <input type="text" name="nom" class="form-control" value="${lista[0].Descripcion}">
                        <label>Fecha</label>
                        <input type="text" name="fecha" class="form-control" value="${lista[0].Fecha}">
                        <label>Responsable</label>
                        <input type="text" name="responsable" class="form-control" value="${lista[0].Responsable}">
                        <label>Numero de Caja</label>
                        <input type="text" name="numcaja" class="form-control" value="${lista[0].NumCaja}">
                        <label>Reposicion</label>
                        <input type="text" name="reposicion" class="form-control" value="${lista[0].Reposicion}" >
                        <label>Saldo</label>
                        <input type="text" name="saldo" class="form-control" value="${lista[0].Saldo}">
                        <label>Total</label>
                        <input type="text" name="total" class="form-control" value="${lista[0].TotEgres}"><br>
                        <input type="submit" value="Actualizar" class="btn btn-success">
                        <a href="index.htm">Regresar</a>
                    </form>
                </div>
            </div>
        </div>
    </body>
</html>
