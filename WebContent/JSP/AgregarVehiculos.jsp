<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Agregar vehiculos de usuario</title>
</head>
<body>
	<div class="container">
		<form action="/Recuperacion-Reinoso-Alex/AgregarVehiculos" method="POST">
			<h1>Registrar auto de cliente</h1>
				<input type="text" placeholder="placa" name="placa" required><br>
				<input type="text" placeholder="cedula del propietario" name="cdi"><br>
				<input type="text" placeholder="Marca del vehiculo" name="marca"><br>
				<input type="text" placeholder="Modelo del vehiculo" name="modelo"><br>
				<button type="submit" name="resp" value="Registrar">Registrar vehiculo</button>
	</form>
	</div>

</body>
</html>