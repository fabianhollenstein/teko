package ch.teko.projektverwaltung.dao;

import java.util.List;

public interface BaseDAO<T> {
	public T getById(int id);
	public void save(T object);
	//public boolean update(T object);
	public void delete(T object);
	public List<T> getAll();
}
