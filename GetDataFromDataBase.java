package maven_project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class GetDataFromDataBase {

	public static void main(String[] args) throws Exception {
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
		
		// Step 4: Executing the query and storing the result
        ResultSet rs = st.executeQuery("select * from employees");

    	// Step 5: Processing the results
       while (rs.next()) {
            System.out.print(rs.getInt(1) + " ");
            System.out.print(rs.getString(2) + ",");
            System.out.print(rs.getString(3)+ " ");
            System.out.println(rs.getString(4));
        }
        
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
