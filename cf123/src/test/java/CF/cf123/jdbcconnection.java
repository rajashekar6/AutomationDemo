package CF.cf123;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class jdbcconnection {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		// TODO Auto-generated method stub
		String host = "localhost";
		String port = "3306";
		
		 //Load mysql jdbc driver		
		Class.forName("com.mysql.jdbc.Driver"); //For MySQL

		Connection con = DriverManager.getConnection("jdbc:mysql//"+ host + ":" + port + "/qadb", "root", "" );
		
		Statement s = con.createStatement();
		ResultSet rs= s.executeQuery("select* from  employeecred where scenerio = 'paid' ");	
		
		while(rs.next())
		{
		System.out.println(rs.getString("email"));
		System.out.println(rs.getString("password"));
		}
	}

}
