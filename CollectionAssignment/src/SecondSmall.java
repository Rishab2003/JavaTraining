import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class SecondSmall {

	public static void main(String[] arg) {
		
		int[] ar= {1,2,4,5,11,99,100};
		System.out.println(secondSmallest(ar));
	}
	
	static int secondSmallest(int[] ar) {
		List<Integer> list= new ArrayList<Integer>();
		for(int i:ar) {
			list.add(i);
		}
		Collections.sort(list);
		return list.get(list.size()-2);
	}
}
