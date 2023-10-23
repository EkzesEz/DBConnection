package ru.example.hibernateTest.DAO;

import java.lang.reflect.ParameterizedType;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;

import lombok.ToString;
import ru.example.hibernateTest.entities.AbstractEntity;

@ToString
public abstract class DAOimpl<T extends AbstractEntity<?>> implements DAO<T>{
	
	@Autowired
	ApplicationContext context;
	
	public T findById(int id) {
		Session session = context.getBean(Session.class);
		T obj = session.get(getEntityType(), id);
		session.close();
		return obj;
	}
	
	public void updateName(T obj, String name){
		obj.setName(name);
	}
	
	public void save(T obj) {
		Session session = context.getBean(Session.class);
		session.save(obj);
		session.close();
	}

	public void delete(T obj) {
		Session session = context.getBean(Session.class);
		session.delete(obj);
		session.close();
	}
	
	@SuppressWarnings("unchecked")
	private Class<T> getEntityType() {
		return (Class<T>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];
	}
}
