package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcEx {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
//		(1)Loading the driver Classes 
		
		Class.forName("oracle.jdbc.driver.OracleDriver");

//		(2)create the connection 

		Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","rita","rita");
		
//		(3)create the statements

		Statement stmt = conn.createStatement();
		
//		(4)execute the statements
		
		stmt.execute("create table product1(id number,name varchar2(10),price number,type varchar2(10))");

//		(5)close the connection
		
		conn.close();
		
		System.out.println("Table is created successfully");
	}
}
