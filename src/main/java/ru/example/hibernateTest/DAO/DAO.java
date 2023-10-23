package ru.example.hibernateTest.DAO;

public interface DAO<T> {
	
	public T findById(int id);
	
	public void updateName(T obj, String name);
	
	public void save(T obj);

	public void delete(T obj);
}
