package ll.user.test;

import ll.user.User;
import ll.user.UserDAO;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class Test {

	public static void main(String[] args) {
		Configuration cfg=new Configuration().configure();
		
		//System.out.println("+++++++ success 1 ++++++++");
		
		SessionFactory sf2=cfg.buildSessionFactory();
		
		//System.out.println("+++++++ success 2 ++++++++");
		
		UserDAO userDAO=new UserDAO(sf2);
		
		User user=new User();
		
		//增加记录
		/*user.setId(6);
		user.setUsername("liliang");
		user.setPassword("19850710");
		userDAO.insert(user);*/
		
		//查询全部记录
		//userDAO.query(user);
		
		//更新记录
		userDAO.update(user);
	}

}
