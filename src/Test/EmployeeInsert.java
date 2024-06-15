package Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class EmployeeInsert {
	
	
	
	static int testSum(int a, int b) {
		return a+b;
	}
	
	static int testInsertedData() throws Exception {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root123");
		
		Statement statement = connection.createStatement();
		
		String sql = "insert into  employees (enam,esal,dept) values  ('Swami',70000,'COMP')";
		
		int  records = statement.executeUpdate(sql);
		
		System.out.println(records);
		
		
		
		
		statement.close();
		connection.close();
		
		return records;
		
	}

	public static void main(String[] args) throws Exception {
		
		
		
		
		
		
	}

}
