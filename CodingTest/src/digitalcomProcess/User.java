package digitalcomProcess;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class User implements IValidate{

	private String userid;
	private String password;
	private static List<User> listUser=new ArrayList<>();
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public void addUser(String userid,String password) {
		
		User u=new User();
		u.setUserid("userid"+userid);
		u.setPassword(password);
		
		boolean validate=IsAuthenticated(userid, password);
		
		if(validate) {
			
			this.listUser.add(u);
			
		}
		else {
			System.out.println("password not valid. length less than 7");
		}
		
		
	}
	
	public boolean IsAuthenticated(String userid, String password) {
		// TODO Auto-generated method stub
		
		if(password.length()<7)
		return false;
		else return true;
	}
	
	
}
