import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SortedMap {
	public static void main(String[] arg) {
		
		Map<String, Integer> map=new HashMap<String, Integer>();
		
		map.put("ravi", 21);
		map.put("bala", 22);
		map.put("rahu", 44);
		
		List<Integer> ansIntegers=getValues(map);
		
		ansIntegers.stream().forEach(System.out::println);
		
	}
	
	static List<Integer> getValues(Map<String, Integer> map){
		List<Integer> list=new ArrayList<>();
		
		for(Map.Entry<String, Integer> e:map.entrySet()) {
			list.add(e.getValue());
		}
		Collections.sort(list);
		return list;
		
	}
}
