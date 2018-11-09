package com.liliang.test;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.liliang.User;
import com.liliang.UserDAO;
import com.liliang.DAO.IUserDAO;

public class Test {
	public static void main(String[] args) {
		System.out.println("1111111");
		
		Configuration config=new Configuration().configure();
		System.out.println("222222222");
		
		SessionFactory sessionFactory=config.buildSessionFactory();
		System.out.println("333333333");
		
		IUserDAO userDAO=new UserDAO(sessionFactory);
		
		User user=new User();
		user.setId(1);
		user.setUsername("liliang");
		user.setPasswd("liliang");
		user.setEmail("123@123.com");
		
		userDAO.insert(user);
	}
}
