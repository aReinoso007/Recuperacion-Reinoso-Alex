package ec.edu.ups.controladores;

import java.io.IOException;
import java.util.GregorianCalendar;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ec.edu.ups.dao.TicketDAO;
import ec.edu.ups.entidad.Ticket;
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

		// Ticket t1 = new Ticket(new GregorianCalendar(2020, 5, 22), new
		// GregorianCalendar(2020, 5, 23),v1);
		// tick.create(t1);
		String cedula = "";
		GregorianCalendar fechaingreso = null;
		GregorianCalendar fechasalida = null;
		
		Ticket ticket = new Ticket();
		String accion = request.getParameter("resp");
		TicketDAO ticketDAO = DAOFatory.

	}

}
