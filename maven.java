package maven_project;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class maven {

	public static void main(String[] args) throws Exception {
		// Loading and registering drivers
        // Optional from JDBC version 4.0
		Class.forName("oracle.jdbc.OracleDriver");
		
		// Step 2:Establishing a connection
		Connection con = DriverManager.getConnection(
	            "jdbc:oracle:thin:@localhost:1521:XE",
	            "admin", "Muzammil073");
		
		// Step 3: Creating statement
		Statement st = con.createStatement();
		
		// Step 4: Executing the query and storing the
        // result
//        ResultSet rs = st.executeQuery(
//            "select * from Employees where Salary >= 10000");
//        
        // Step 5: Processing the results
//        while (rs.next()) {
//            System.out.println(rs.getString("employees"));
//            System.out.println(rs.getInt("salary"));
//        }
//        
        //create table dynamically
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("Enter the table name : ");
        
        String tname = br.readLine();
        
        //write sql query
        String query = "create table "+tname+ "(ENO number(3) primary key,ENAME varchar2(10), ESAL float(5))";
        
        //Execute sql query
        st.executeUpdate(query);
        
        System.out.println(tname+" Table is created successfully ");
        
        
 
        // Step 6: Closing the connections
        // using close() method to release memory resources  
        st.close();
        con.close();
       
      // Display message for successful execution of program
      System.out.println("Steps in Setting Up of JDBC");

	}

}
