package ec.edu.ups.controladores;

import java.io.IOException;
import java.util.GregorianCalendar;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ec.edu.ups.dao.DAOFactory;
import ec.edu.ups.dao.TicketDAO;
import ec.edu.ups.dao.VehiculoDAO;
import ec.edu.ups.entidad.Ticket;
import ec.edu.ups.entidad.Vehiculo;
import ec.edu.ups.jpa.*;

/**
 * Servlet implementation class RegistrarTicket
 */
@WebServlet("/RegistrarTicket")
public class RegistrarTicket extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public RegistrarTicket() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		
		String cedula = "";
		GregorianCalendar fechaingreso = null;
		GregorianCalendar fechasalida = null;
		String placa ="";
		
		Ticket ticket = new Ticket();
		Vehiculo vehiculo = new Vehiculo();
		VehiculoDAO vDao = DAOFactory.getFactory().getVehiculoDAO();
		String accion = request.getParameter("resp");
		TicketDAO ticketDAO = DAOFactory.getFactory().getTicketDAO();
		
		if(accion.equals("Registrar")) {
			cedula = request.getParameter("cdi");
			placa = request.getParameter("placa");
			fechaingreso = new GregorianCalendar(	Integer.parseInt(request.getParameter("aIngreso")), 
													Integer.parseInt(request.getParameter("mIngreso")),
													Integer.parseInt(request.getParameter("dIngreso")));
			
			fechasalida = new GregorianCalendar(	Integer.parseInt(request.getParameter("aSalida")), 
					Integer.parseInt(request.getParameter("mSalida")),
					Integer.parseInt(request.getParameter("dSalida")));
			
			vehiculo = vDao.buscarVehiculo(cedula, placa);
			System.out.println("Vehiculo recuperado:"+vehiculo);
			// Ticket t1 = new Ticket(new GregorianCalendar(2020, 5, 22), new
			// GregorianCalendar(2020, 5, 23),v1);
			// tick.create(t1);
			ticket = new Ticket(fechaingreso, fechasalida, vehiculo);
			
			ticketDAO.create(ticket);
			System.out.println("Ticket creado");
			
			getServletContext().getRequestDispatcher("/JSP/Index.jsp").forward(request, response);
		}
		

	}

}
