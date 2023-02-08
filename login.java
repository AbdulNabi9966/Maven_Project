package maven_project;

public class login {
private int userid;
private String password;
private String username;
private String mobileno;
@Override
public String toString() {
	return "login [userid=" + userid + ", username=" + username + ", mobileno=" + mobileno + "]";
}
public int getUserid() {
	return userid;
}
public void setUserid(int userid) {
	this.userid = userid;
}
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public String getMobileno() {
	return mobileno;
}
public void setMobileno(String mobileno) {
	this.mobileno = mobileno;
}



}
