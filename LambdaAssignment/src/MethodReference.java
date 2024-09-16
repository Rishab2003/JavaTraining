
public class MethodReference {
	
	public static int calculateFactorial(int n) {
		int ans=1;
		for(int i=1;i<=n;i++) {
			ans*=i;
		}
		return ans;
	}
	
	public static String Format(String s) {
		String ans="";
		for(int i=0;i<s.length();i++) {
			if(i!=s.length()-1)
				ans=ans+s.charAt(i)+" ";
			else
				ans=ans+s.charAt(i);
		}
		return ans;
	}
	public static boolean validate(String uname,String pwd) {
		String USER="Admin";
		String PASSWORD="123@";
		
			if(uname.equals(USER) && pwd.equals(PASSWORD)) 
				return true;
			else
				return false;
	};
}

