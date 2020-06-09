package ec.edu.ups.dao;

import java.util.List;

import ec.edu.ups.entidad.Cliente;

public interface GenericDAO<T, ID> {
	
	public void createTable();

	public void create(T entity);

	public T read(ID id);

	public void update(T entity);

	public void delete(T entity);

	public List<T> find();
	void deleteByID(ID id);
	List<T> findAll();
	Cliente buscar(String cdi);
}
