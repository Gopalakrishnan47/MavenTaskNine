package task12;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JBDCConnector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Step 1: Provided connection details
		
		String db_url="jdbc:mysql://localhost:3306";
		String username="root";
		String password="root";
		
		// Step 2: Establish the connection
		
		try {
			Connection connection = DriverManager.getConnection(db_url, username, password);
			
			// Step 3: Perform operations
			
				// Step 1: create the statements
			String create_DB="create database employee_DB01";
			String useDB="use employee_DB01";
			String createTable="create table empl_table (empcode int, empname varchar(25), empage int, esalary long)";
			String insert="insert into empl_table values (101, 'Jenny', 25, 10000),(102, 'Jacky', 30, 20000),(103, 'Joe', 20, 40000),(104, 'John', 40, 80000),(105, 'Shameer', 25,90000)";
			String select="Select * from empl_table";
		
			
				// Step 2: Executing  the statements.
			
			Statement smt = connection.createStatement();
			
			smt.execute(create_DB); 
			smt.execute(useDB);
			smt.execute(createTable);
			smt.executeUpdate(insert);  
			
			ResultSet result = smt.executeQuery(select); 
			
			while(result.next()) {
				
				System.out.println(result.getInt("empcode")+"||"+result.getString("empname")+"||"+result.getInt("empage")+"||"+result.getLong("esalary"));
			}
			
			
			// Step 4: Close the connection
			
			connection.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
