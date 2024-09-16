import java.util.HashMap;
import java.util.Map;

public class CountChar {
	public static void main(String[] args) {
		char ch[]= {'a','w','a','w','v','w','i','z','u'};
		
		Map<Character, Integer> ansMap=countChar(ch);
		
		System.out.println(ansMap);
	}
	
	static Map<Character, Integer> countChar(char[] ar){
		
		Map<Character, Integer> map=new HashMap<>();
		for(char ch:ar) {
			if(map.containsKey(ch))
				map.put(ch, map.get(ch)+1);
			else
				map.put(ch, 1);
		}
		return map;
	}
}
