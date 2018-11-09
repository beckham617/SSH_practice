package insert.db;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.opensymphony.xwork2.ActionSupport;

import conn.db.conndb;
public class insertaction extends ActionSupport {
	private String username;
	private String password;
	private String id;
	
	public String getUsername(){
		return username;
	}
	
	public void setUsername(String username){
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
	
	public void setId(String id){
		this.id=id;
	}
	
	public String insertdb(){
		conndb db=new conndb();
		Connection con=db.getconn();	
		PreparedStatement pstmt=null;
		
		String sql="insert into info  value(?,?,?)";
		try{
			
			pstmt=con.prepareStatement(sql);
			
			pstmt.setString(1,username);
			pstmt.setString(2,password);
			pstmt.setString(3,id);
			
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

	

