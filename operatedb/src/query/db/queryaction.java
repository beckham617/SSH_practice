package query.db;


import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

import conn.db.conndb;
import conn.db.info;

public class queryaction extends ActionSupport {
	
	
	
	public String username;
	public String id;
	
	List list=new ArrayList();
	
	public String getUsername(){
		return username;
	}
	
	public void setUsername(String username){
		this.username=username;
	}
	
	public String getId(){
		return id;
	}
	
	public void setId(String id){
		this.id=id;
	}
	
	public String querydb(){
		HttpServletRequest request = ServletActionContext.getRequest(); 
		HttpSession session = request.getSession();
		
		conndb db=new conndb();
		Connection con=null;
		con=db.getconn();
		Statement stmt=null;
		ResultSet rs = null;
		String sql="";
		
		try{
			if(!username.equals(""))
			{
			
				if(!id.equals(""))
				{
					
					sql="select * from info where e_name='"+username+"'and e_id='"+id+"'";
					stmt=con.createStatement();
					rs=stmt.executeQuery(sql);
					
				}
				else
				{	
					
					sql="select*from info where e_name='"+username+"'";
					stmt=con.createStatement();
					rs=stmt.executeQuery(sql);
				
				}
				
			}
			else
			{
				if(!id.equals(""))
				{	
					sql="select*from info where e_id='"+id+"'";
					stmt=con.createStatement();
					rs=stmt.executeQuery(sql);
				}
				else
				{
					
				}
				
			}
			
			if(rs!=null)
			{
				
				list.clear();
				try{
					info in=new info();
					in.setUsername(rs.getString("e_name"));
					in.setPassword(rs.getString("e_password"));
					in.setId(rs.getString("e_id"));
					
					list.add(in);
				}catch (SQLException e) 
				{
					 
					e.printStackTrace();
				}
				
				try {
					
					
					stmt.close();
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
				
			}
			
		}catch (SQLException e) {
			e.printStackTrace();
		}
		
		session.setAttribute("love",list);
		
		return SUCCESS;
		
		
		
	}
}
