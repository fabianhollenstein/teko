package ch.teko.projektverwaltung.dao;

public interface BaseDAO<T> {
	public T getById(int id);
	public boolean save(T object);
	public boolean update(T object);
	public boolean delete(T object);
}
