package ch.teko.projektverwaltung.dao;

import java.util.List;
/**
 * Methoden für Die DAO Objekte werde hier vorgegeben
 * @author Fabian
 *
 * @param <T>
 */
public interface BaseDAO<T> {
	public T getById(int id);
	public void save(T object);
	//public boolean update(T object);
	public void delete(T object);
	public List<T> getAll();
}
