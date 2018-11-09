package conn.db;

import com.opensymphony.xwork2.ActionSupport;

public class info extends ActionSupport {
	public info(){}
	
	public String username;
	public String password;
	public String id;
	
	public String getUsername(){
		return username;
	}
	
	public void setUsername(String username) {
		this.username = username;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void serUsername(String username){
		this.username=username;
	}
	
	public String getPassword(){
		return password;
	}
	
	public void setPassword(String password){
		this.password=password;
	}
	
	public String getId(){
		return id;
	}
	
}
