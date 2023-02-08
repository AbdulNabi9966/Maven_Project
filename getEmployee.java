package maven_project;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class getEmployee {
public  Employee getEmployee(int emp_id) {
		
		Employee emp =new Employee();
		DatabaseConnection connect = new DatabaseConnection();
		
		try {
            
			Statement stmt =connect.getConnection().createStatement();
			ResultSet rs =stmt.executeQuery("select * from employees where employee_id="+emp_id);			
			while(rs.next()) {
				emp.setEmpId(rs.getInt("EMPLOYEE_ID"));
				emp.setFname(rs.getString("FIRST_NAME"));
				emp.setLname(rs.getString("LAST_NAME"));
				emp.setPhoneno(rs.getString("PHONE"));
				emp.setEmailid(rs.getString("EMAIL"));
				emp.setJobtitle(rs.getString("JOB_TITLE"));
				emp.setHiredate(rs.getDate("HIRE_DATE"));
				emp.setManagerid(rs.getInt("MANAGER_ID"));
			}
		
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			connect.closeConnection();
		}
return emp;
	}
}
