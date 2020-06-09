<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Crear usuario</title>
</head>
<body>
<div class="header">
	<h1>Agregar cliente</h1>
</div>
<div class="topnav">
	
</div>
<div class="container">
	<form action="/Recuperacion-Reinoso-Alex/CrearCliente" method="POST">
		<h1>Registrar Cliente</h1><br>
				<input type="text" placeholder="Cedula" name="cdi" required><br>
				<input type="text" placeholder="Nombre" name="nombre" required><br>
				<input type="text" placeholder="Direccion" name="direccion" required><br>
				<input type="text" placeholder="Telefono" name="telefono" required><br>
				<button type="submit" name="resp" value="Registrarse">Registrarse</button>
	</form>
</div>


</body>
</html>