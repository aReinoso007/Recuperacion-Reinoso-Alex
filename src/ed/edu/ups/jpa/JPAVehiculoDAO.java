package ed.edu.ups.jpa;

import javax.persistence.Persistence;

import ec.edu.ups.dao.VehiculoDAO;
import ec.edu.ups.entidad.Vehiculo;

public class JPAVehiculoDAO extends JPAGenericDAO<Vehiculo, String> implements VehiculoDAO{
	
	public JPAVehiculoDAO() {
		super(Vehiculo.class);
		this.em = Persistence.createEntityManagerFactory("Recuperacion-Reinoso-Alex").createEntityManager();
		// TODO Auto-generated constructor stub
	}
	
}