package com.liliang;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.liliang.DAO.IUserDAO;

public class UserDAO implements IUserDAO {
	
	private SessionFactory sessionFactory;
	
	public UserDAO(SessionFactory sessionFactory){
		this.setSessionFactory(sessionFactory);
	}
	public void setSessionFactory(SessionFactory sessionFactory){
		this.sessionFactory=sessionFactory;
	}
	
	public void insert(User user) {
		
		Session session =sessionFactory.openSession();
		
		Transaction tx=session.beginTransaction();
		
		session.save(user);
		
		tx.commit();
		session.close();
	}

}
