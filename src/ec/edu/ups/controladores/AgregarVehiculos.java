package ec.edu.ups.controladores;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ec.edu.ups.dao.ClienteDAO;
import ec.edu.ups.dao.DAOFactory;
import ec.edu.ups.dao.VehiculoDAO;
import ec.edu.ups.entidad.Cliente;
import ec.edu.ups.entidad.Vehiculo;

/**
 * Servlet implementation class AgregarVehiculo
 */
@WebServlet("/AgregarVehiculos")
public class AgregarVehiculos extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AgregarVehiculos() {
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
		
		String placa="";
		String marca="";
		String modelo="";
		String cedula="";
		
		Vehiculo vehiculo = new Vehiculo();
		Cliente cliente = new Cliente();
		ClienteDAO cliDao = DAOFactory.getFactory().getClienteDAO();
		String accion = request.getParameter("resp");
		VehiculoDAO vehiculoDAO = DAOFactory.getFactory().getVehiculoDAO();
		
		if(accion.equals("Registrar")) {
			cedula = request.getParameter("cdi");
			placa = request.getParameter("placa");
			marca = request.getParameter("marca");
			modelo = request.getParameter("modelo");
			
			System.out.println("Cedula que se va a buscar: "+cedula);
			cliente = cliDao.buscar(cedula);
			System.out.println("Cliente recuperdo: "+cliente);
			System.out.println("Cliente a ser agregado");
			
			vehiculo = new Vehiculo(placa, cliente, marca, modelo);
			System.out.println("Vehiculo a crear: "+vehiculo);
			
			vehiculoDAO.create(vehiculo);
			System.out.println("Vehiculo agregado correctamente");
			
			getServletContext().getRequestDispatcher("/JSP/Index.jsp").forward(request, response);
		}
		
	}

}
