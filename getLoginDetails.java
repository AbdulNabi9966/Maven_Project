package maven_project;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class getLoginDetails {
public login getDetails(int user_id) {
	login log = new login();
	DatabaseConnection db = new DatabaseConnection();
	
	try {
		Statement st = db.getConnection().createStatement();
		ResultSet rs = st.executeQuery("select * from login where user_id="+user_id);
		while(rs.next()) {
			log.setUserid(rs.getInt("USER_ID"));
			log.setUsername(rs.getString("USER_NAME"));
			log.setMobileno(rs.getString("PHONE_NO"));
		}
		
	} catch (SQLException e) {
		e.printStackTrace();
	}finally {
		db.closeConnection();
	}
	return log;
}
}
