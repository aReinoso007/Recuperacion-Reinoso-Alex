package ed.edu.ups.jpa;

import javax.persistence.Persistence;

import ec.edu.ups.dao.ClienteDAO;
import ec.edu.ups.entidad.*;

public class JPAClienteDAO extends JPAGenericDAO<Cliente, String> implements ClienteDAO{

	public JPAClienteDAO() {
		super(Cliente.class);
		this.em = Persistence.createEntityManagerFactory("Recuperacion-Reinoso-Alex").createEntityManager();
		// TODO Auto-generated constructor stub
	}

}