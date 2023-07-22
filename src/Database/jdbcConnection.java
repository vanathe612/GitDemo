package Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class jdbcConnection {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		String host="localhost";
		String port = "3306";
		
		Connection con = DriverManager.getConnection("jdbc:mysql://" + host + ":" + port + "/Qadbt","root", "Vanu@123");
		Statement s = con.createStatement();
		ResultSet rs = s.executeQuery("select * from Employeeinfo where name = 'Vanathe'");
		
		while(rs.next())
		{
		System.out.println(rs.getString("location"));
		System.out.println(rs.getInt("age"));
		}
		// check notebook for selenium code
		
	}

}
