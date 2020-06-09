<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registrar Ticket</title>
</head>
<body>
	<div class="container">
		<form action="/Recuperacion-Reinoso-Alex/RegistrarTicket" method="POST">
			<input type="text" placeholder="placa" name="placa"><br>
			<input type="text" placeholder="cedula" name="cdi"><br>
			
			<input type="text" placeholder="Anio Ingreso" name="aIngreso">
			<input type="text" placeholder="Mes Ingreso" name="mIngreso">
			<input type="text" placeholder="dia Ingreso" name="dIngreso"><br>
			
			<input type="text" placeholder="Anio Salida" name="aSalida">
			<input type="text" placeholder="Mes Salida" name="mSalida">
			<input type="text" placeholder=Dia Salida" name="dSalida"><br>
			
			<button type="submit" name="resp" value="Registrar">Registrar Ticket</button>
		</form>"
	</div>

</body>
</html>