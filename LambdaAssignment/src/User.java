

public class User {
	public static void main(String[] args) {
		String USER="Admin";
		String PASSWORD="123@";
		
		UserValidate userValidate=(uname,pwd)->{
			if(uname.equals(USER) && pwd.equals(PASSWORD)) 
				return true;
			else
				return false;
		};
		
		System.out.println(userValidate.validate("Admin", "123@"));
		
		//method refernce from MethodRefernce class
		
		UserValidate userValidate2=MethodReference::validate;
		System.out.println(userValidate2.validate("admin", "11"));
		
	}
}
