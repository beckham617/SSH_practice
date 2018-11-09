package conn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Conndb {
	
	String url="jdbc:mysql://localhost:3306/work";
	String usename="root";
	String password="19850710";
	String sql="";
	
	
	public Connection con=null;
	public Statement stmt=null;
	
	public Connection getconn(){
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection(url,usename,password);
		}
		catch (Exception ex) {
            ex.printStackTrace();
        }
        return con;
	}
}
