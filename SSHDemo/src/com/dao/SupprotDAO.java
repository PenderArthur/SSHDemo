package com.dao;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.inter.SupportDAOInter;

@Transactional
public abstract class SupprotDAO<T> implements SupportDAOInter<T>{
	 
	@Autowired private SessionFactory sessionFactory;
	private Session session;
	private Class clazz;
	public SupprotDAO(){
		clazz= GenericsUtils.getSuperClassGenricType(this.getClass());;
	}
	public void save(T o){
		session = getCurrentSession();
		session.save(o);
		
	}
	public void delete(T o){
		session = getCurrentSession();
		session.delete(o);
	}
	public void update(T o){
		session = getCurrentSession();
		session.update(o);
	}
	 public void deleteByID(int id){
		 session = getCurrentSession();
		 session.delete(this.queryByID(id));
	 }
	 @SuppressWarnings("unchecked")
	public T queryByID(int id){
		 session = getCurrentSession();
		 return (T) session.get(clazz, id); 
	 }
	public Session getCurrentSession() {
		return sessionFactory.getCurrentSession();
	}
}
