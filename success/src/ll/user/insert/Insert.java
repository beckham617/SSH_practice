package ll.user.insert;

import ll.user.User;
import ll.user.UserDAO;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.opensymphony.xwork2.ActionSupport;

public class Insert extends ActionSupport{
	private int id;
	private String username;
	private String password;
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}	
	public String insertdb(){
		
		Configuration cfg=new Configuration().configure();
		
		//System.out.println("+++++++ success 1 ++++++++");
		
		SessionFactory sf2=cfg.buildSessionFactory();
		
		//System.out.println("+++++++ success 2 ++++++++");
		
		UserDAO userDAO=new UserDAO(sf2);
		
		User user=new User();
		
		user.setId(id);
		user.setUsername(username);
		user.setPassword(password);
		
		userDAO.insert(user);	
		
		return SUCCESS;
	}
}
