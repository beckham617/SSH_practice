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
		
		//���Ӽ�¼
		/*user.setId(6);
		user.setUsername("liliang");
		user.setPassword("19850710");
		userDAO.insert(user);*/
		
		//��ѯȫ����¼
		//userDAO.query(user);
		
		//���¼�¼
		userDAO.update(user);
	}

}
