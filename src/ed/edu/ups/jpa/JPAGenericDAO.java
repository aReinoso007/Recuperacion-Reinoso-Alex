package ed.edu.ups.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.Query;

import ec.edu.ups.dao.GenericDAO;
import ec.edu.ups.entidad.Cliente;

public class JPAGenericDAO<T, ID> implements GenericDAO<T, ID> {

	private Class<T> persistentClass;
	protected EntityManager em;

	public JPAGenericDAO(Class<T> persistentClass) {
		this.persistentClass = persistentClass;
		this.em = Persistence.createEntityManagerFactory("Recuperacion-Reinoso-Alex").createEntityManager();
	}

	
	@Override
	public void createTable() {
		// TODO Auto-generated method stub
		
		
	}

	@Override
	public void create(T entity) {
		
		em.getTransaction().begin();
		try {
			em.persist(entity);
			em.getTransaction().commit();
		} catch (Exception e) {
			System.out.println("INGRESANDO: /n");
			System.out.println(">>>> ERROR:JPAGenericDAO:create " + e);
			if (em.getTransaction().isActive())
				em.getTransaction().rollback();
		}
	}

	@Override
	public T read(ID id) {
		System.out.println("Buscando...");
		//Query nq = em.createNativeQuery("SELECT * FROM CLIENTE WHERE cedula=?", Cliente.class);
		//nq.setParameter(1, id);
		System.out.println(em.find(persistentClass, id));
		return em.find(persistentClass, id);
	}

	@Override
	public void update(T entity) {
		System.out.println("Actualizando.....");
		em.getTransaction().begin();
		try {
			em.merge(entity);
			em.getTransaction().commit();
		} catch (Exception e) {
			System.out.println(">>>> ERROR:JPAGenericDAO:update " + e);
			if (em.getTransaction().isActive())
				em.getTransaction().rollback();
		}
		
	}

	@Override
	public void delete(T entity) {
		System.out.println("ELIMINANDO...");
		em.getTransaction().begin();
		try {
			em.remove(entity);
			em.getTransaction().commit();
		} catch (Exception e) {
			System.out.println(">>>> ERROR:JPAGenericDAO:delete " + e);
			if (em.getTransaction().isActive())
				em.getTransaction().rollback();
		}
		
	}

	@Override
	public List<T> find() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public void deleteByID(ID id) {
		T entity = this.read(id);
		if (entity != null)
			this.delete(entity);
		
	}


	@Override
	public List<T> findAll() {
		em.getTransaction().begin();
		List<T> lista = null;
		try {
			javax.persistence.criteria.CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
			cq.select(cq.from(persistentClass));
			lista = em.createQuery(cq).getResultList();
			em.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return lista;
	}


	@Override
	public Cliente buscar(String cdi) {
		Query nq = em.createNativeQuery("SELECT * FROM CLIENTE WHERE cedula=?", Cliente.class);
		nq.setParameter(1, cdi);
		System.out.println("cedula para consultar: " +cdi);
		System.out.println("Resultado de la busqueda: "+nq.getSingleResult());
		return (Cliente) nq.getSingleResult();
	}

}

