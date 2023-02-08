package maven_project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
	private static final String url = "jdbc:oracle:thin:@microcareacademydb_high?TNS_ADMIN=C://Users//abdul//Downloads//Wallet_MicrocareAcademyDB";
	private static final String userName = "ADMIN";
	private static final String password = "Muzammil073#";
	
	private Connection con;

	static {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public Connection getConnection(){
		try {
			con = DriverManager.getConnection(url, userName, password);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return con;	
	}
	
	public void closeConnection() {
		try {
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
