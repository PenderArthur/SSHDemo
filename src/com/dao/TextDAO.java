package com.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.model.User;

@Repository
@Transactional
public class TextDAO {
	@Autowired private SessionFactory sessionfactory;
	public void save (User user){
		sessionfactory.getCurrentSession().save(user);
		System.out.println("save scuessaaa?");
	}

}
