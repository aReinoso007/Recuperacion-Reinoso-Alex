package ec.edu.ups.controladores;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ec.edu.ups.dao.ClienteDAO;
import ec.edu.ups.dao.DAOFactory;
import ec.edu.ups.entidad.Cliente;

/**
 * Servlet implementation class CrearCliente
 */
@WebServlet("/CrearCliente")
public class CrearCliente extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CrearCliente() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String cedula;
		String nombre;
		String direccion;
		String telefono;
		
		Cliente cliente = new Cliente();
		
		String accion = request.getParameter("resp");
		ClienteDAO clienteDAO = DAOFactory.getFactory().getClienteDAO();
		
		if(accion.equals("Registrarse")) {
			cedula = request.getParameter("cdi");
			nombre = request.getParameter("nombre");
			direccion = request.getParameter("direccion");
			telefono = request.getParameter("telefono");
			
			//Cliente("1400919312","Sharon", "Macas","0998952719");
			cliente = new Cliente(cedula, nombre, direccion, telefono);
			System.out.println("el cliente: "+cliente);
			
			System.out.println("Creando cliente en base");
			clienteDAO.create(cliente);
			System.out.println("Clientes registrados"+clienteDAO.findAll());
			
			getServletContext().getRequestDispatcher("/JSP/Index.jsp").forward(request, response);
		}
		
	}

}
