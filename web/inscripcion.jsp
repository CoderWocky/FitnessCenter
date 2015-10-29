<%-- 
    Document   : inscripcion
    Created on : 28-oct-2015, 11:01:12
    Author     : alumno
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:useBean id="inscripcion" scope="session" class="FitnessCenter.Inscripcion"/>
<% if (request.getParameter("nombre") != null) { %>
  <jsp:setProperty name="inscripcion" property="*"/>
<% } %>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Nuevo cliente</title>
    <style>
      body {
        background-color: blue;
        font-family: Calibri, sans-serif;
        font-size: 16px;
      }
      label {
        color: white;
        display: inline-block;
        width: 10%;
      }
    </style>
  </head>
  <body>
    <form action="inscripcion.jsp" method="post">
      <label for="nombre">Nombre</label>
      <input name="nombre" type="text" required autofocus/>
      <br/>
      <label for="apellido1">Primer apellido</label>
      <input name="apellido1" type="text" required/>
      <br/>
      <label for="apellido2">Segundo apellido</label>
      <input name="apellido2" type="text" required/>
      <br/>
      <label for="domicilio">Domicilio</label>
      <input name="domicilio" type="text" required/>
      <br/>
      <label for="fechaNac">Fecha nacimiento</label>
      <input name="fechaNac" type="date" required/>
      <br/>
      <label for="telefono">Teléfono</label>
      <input name="telefono" type="tel" required/>
      <br/>
      <label for="dni">D.N.I.</label>
      <input name="dni" type="text" required/>
      <br/>
      <label for="tipoCuota">Tipo de cuota</label>
      <select name="tipoCuota">
        <option disabled selected>Seleccione cuota...</option>
        <option value="F">Familiar</option>
        <option value="I">General individual</option>
        <option value="M">Mañanas</option>
        <option value="3">Tercera edad</option>
      </select>
      <br/>
      <input type="submit" value="Enviar inscripción"/>
    </form>
  </body>
</html>