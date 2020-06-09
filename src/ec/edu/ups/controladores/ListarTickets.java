package ec.edu.ups.controladores;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ec.edu.ups.dao.DAOFactory;
import ec.edu.ups.dao.TicketDAO;
import ec.edu.ups.entidad.*;
/**
 * Servlet implementation class ListarTickets
 */
@WebServlet("/ListarTickets")
public class ListarTickets extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private TicketDAO ticketDAO;
	private List<Ticket> listaTickets;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ListarTickets() {
        ticketDAO = DAOFactory.getFactory().getTicketDAO();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
		listaTickets = ticketDAO.findAll();
		System.out.println("Listas de tickets recuperadas: "+ticketDAO.findAll());
		request.setAttribute("tickets", listaTickets);
		
		}catch(Exception e) {
			System.out.println("Error en listar: "+e.getMessage());
		}
		getServletContext().getRequestDispatcher("/JSP/ListasTickets.jsp").forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
