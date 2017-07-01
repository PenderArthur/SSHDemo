package com.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.transaction.annotation.Transactional;

import com.inter.UserDAOInter;
import com.model.User;
@Transactional
public class UserDAO extends SupprotDAO<User> implements UserDAOInter<User>{

	public List<User> qyeryAll() {
		Session session = getCurrentSession();
		return session.createQuery("from user").list();
	}

	@Override
	public User queryByNumber(String number) {
		Session session = getCurrentSession();
		String hql = "from user where number = ?";
		Query query = session.createQuery(hql);
		query.setParameter(0, number);
		List <User> list = query.list();
		return list.size()>0 ? list.get(0) : null;
	}

	@Override
	public User queryByNumberAndPsw(String number, String psw) {
		// TODO Auto-generated method stub
		Session session = getCurrentSession();
		String hql = "from user where number = ? and password = ?";
		Query<User> query = session.createQuery(hql);
		query.setParameter(0, number);
		query.setParameter(1, psw);
		List <User> list = query.list();
		return list.size()>0 ? list.get(0) : null;
	}

	@Override
	public User queryByEmail(String email) {
		// TODO Auto-generated method stub
		Session session = getCurrentSession();
		String hql = "from user where email = ?";
		Query<User> query = session.createQuery(hql);
		query.setParameter(0, email);
		List <User> list = query.list();
		return list.size()>0 ? list.get(0) : null;
	}
	
}
