<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<c:set var="t1" value="${requestScope['tickets']}" />
	<!-- <c:set var="v1" value="${requestScope['vehiculos']}" />
	<c:set var="c1" value="${requestScope['cliente']}" /> -->
	<div class="container">
		<form action="/Recuperacion-Reinoso-Alex/ListarTickets" method="GET">
			<div class="header">
				<table class="container">
					<thead>
						<tr>
							<th><h1>ID ticket</h1>
							<th><h1>Fecha Ingreso</h1>
							<th><h1>Fecha Salida</h1>
							<th><h1>Placa</h1>
							<!-- <th><h1>Nombre</h1> -->
							<th><h1>Cedula</h1>
						</tr>
					</thead>
					<tbody>
						<c:forEach var="ticket" items="${t1 }">
							<tr>
								<td>${ticket.numero }</td>
								<td>${ticket.fechaingreso }</td>
								<td>${ticket.fechasalida }</td>
								<td>${ticket.vehiculo_placa }</td>
								<td>${ticket.vehiculo_placa.cliente_cedula}</td>
							</tr>
							
						</c:forEach>
					</tbody>
				</table>
			</div>
			
			
		</form>
	</div>

</body>
</html>