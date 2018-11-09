package conn.db;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
public class conndb {
	
	String url="jdbc:mysql://localhost:3306/employer";
	String usename="root";
	String password="19851221hebe";
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
