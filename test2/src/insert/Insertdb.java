package insert;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.opensymphony.xwork2.ActionSupport;

import conn.Conndb;

public class Insertdb extends ActionSupport {
	private int id;
	private String username;
	private String password;
		
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}

	public String insert(){
		Conndb conndb=new Conndb();
		Connection con=conndb.getconn();	
		PreparedStatement pstmt=null;
		
		String sql="insert into user1  value(?,?,?)";
		try{
			
			pstmt=con.prepareStatement(sql);
			
			pstmt.setInt(1,id);
			pstmt.setString(2,password);
			pstmt.setInt(3,id);
			
			pstmt.executeUpdate();
		}
		catch (SQLException e) 
		{
			 
			e.printStackTrace();
		}
		
		try {
			
			
			pstmt.close();
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return SUCCESS;
	}
}
