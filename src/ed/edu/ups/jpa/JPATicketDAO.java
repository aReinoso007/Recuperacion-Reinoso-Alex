package ed.edu.ups.jpa;

import javax.persistence.Persistence;

import ec.edu.ups.dao.TicketDAO;
import ec.edu.ups.entidad.Ticket;

public class JPATicketDAO extends JPAGenericDAO<Ticket, Integer> implements TicketDAO{

	public JPATicketDAO() {
		super(Ticket.class);
		this.em = Persistence.createEntityManagerFactory("Recuperacion-Reinoso-Alex").createEntityManager();
	}
	
}
