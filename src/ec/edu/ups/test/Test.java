package ec.edu.ups.test;

import java.util.GregorianCalendar;

import ec.edu.ups.dao.ClienteDAO;
import ec.edu.ups.dao.DAOFactory;
import ec.edu.ups.dao.TicketDAO;
import ec.edu.ups.dao.VehiculoDAO;
import ec.edu.ups.entidad.Cliente;
import ec.edu.ups.entidad.Ticket;
import ec.edu.ups.entidad.Vehiculo;

public class Test {

	public static void main(String[] args) {
		
		ClienteDAO cli = DAOFactory.getFactory().getClienteDAO();
		VehiculoDAO vehi = DAOFactory.getFactory().getVehiculoDAO();
		TicketDAO tick = DAOFactory.getFactory().getTicketDAO();
		
		Cliente c1 =new Cliente("1400919302","Alex", "Macas","0998952718");
		Cliente c2 =new Cliente("1400919312","Sharon", "Macas","0998952719");
		
		
		
		
		
		//System.out.println(c2);
		//cli.create(c2);
		
		//System.out.println("Usuario creado");
		
		System.out.println("Agregando vehiculo al usuario");
		Vehiculo v1 = new Vehiculo("ABCD", c1, "toyota", "m1");
		//Ticket t1 = new Ticket(new GregorianCalendar(2020, 5, 22), new GregorianCalendar(2020, 5, 23),v1);
		//tick.create(t1);
		
		
		//vehi.create(v1);
		//System.out.println("vehiculo creado");

		//System.out.println(cli.buscar("1400919312"));
		
		System.out.println("Consulta de vehiculo: "+vehi.buscarVehiculo("1400919302", "ABCD"));
	}

}
