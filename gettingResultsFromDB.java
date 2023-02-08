package maven_project;

public class gettingResultsFromDB {

	public static void main(String[] args) {
		//getEmployee Ge = new getEmployee();
		//System.out.println(Ge.getEmployee(20).toString());
		
		getLoginDetails gld = new getLoginDetails();
		System.out.println(gld.getDetails(1).toString());
	}

}
