
public class StringFormat {
	public static void main(String arg[]) {
		
		Format format=(String s)->{
			String ans="";
			for(int i=0;i<s.length();i++) {
				if(i!=s.length()-1)
					ans=ans+s.charAt(i)+" ";
				else
					ans=ans+s.charAt(i);
			}
			return ans;
		};
		
		System.out.println(format.change("abcd"));
		
		//method Refernce
		Format format2=MethodReference::Format;
		System.out.println(format2.change("ccc"));
	}
}
