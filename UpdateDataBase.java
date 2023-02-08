package maven_project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateDataBase {
	
	public static void main(String[] args) throws ClassNotFoundException {
		
		// Loading and registering drivers
				Class.forName("oracle.jdbc.driver.OracleDriver");
				Connection con = null;
				
						try {
				
				// Step 2:Establishing a connection
							con = DriverManager.getConnection(
			            "jdbc:oracle:thin:@microcareacademydb_high?TNS_ADMIN=C://Users//abdul//Downloads//Wallet_MicrocareAcademyDB",
			            "ADMIN", "Muzammil073#");
				
				// Step 3: Creating statement
				Statement st = con.createStatement();
				
		       // updating the query statement
		    	int results = st.executeUpdate("update employees set first_name='Ravi Malleypula' where employee_id = 108"); 
		        System.out.println(results);
						}catch (Exception e){
							e.printStackTrace();
						}finally {
							try {
								con.close();
							}catch (SQLException e) {
								e.printStackTrace();
							}
						}
			}
	}
