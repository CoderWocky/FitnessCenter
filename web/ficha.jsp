<%-- 
    Document   : ficha
    Created on : 28-oct-2015, 11:24:06
    Author     : alumno
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:useBean id="inscripcion" scope="session" class="FitnessCenter.Inscripcion"/>

<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Ficha cliente</title>
    <style>
      body {
        background-color: blue;
        font-family: Calibri, sans-serif;
        font-size: 16px;
      }
      h1 {
        color: white;
        text-align: center;
      }
      table, tr, td {
        border: 1px solid white;
        color: white;
      }
      table {
        border-collapse: collapse;
        margin:auto;
      }
    </style>
  </head>
  <body>
    <h1>CONSULTA FICHA ABONADO</h1>
    <table>
      <tr><td>
        <strong>Abonado: </strong>
        <jsp:getProperty name="inscripcion" property="nombre"/> 
        <jsp:getProperty name="inscripcion" property="apellido1"/> 
        <jsp:getProperty name="inscripcion" property="apellido2"/>
      </td></tr>
      <tr><td>
        <strong>Fecha Nacimiento: </strong>
        <jsp:getProperty name="inscripcion" property="fechaNac"/>
      </td></tr>
      <tr><td>
        <strong>Importe cuota (€): </strong>
        <jsp:getProperty name="inscripcion" property="cuota"/>
      </td></tr>
    </table>
  </body>
</html>