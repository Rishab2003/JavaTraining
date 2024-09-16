import java.util.HashMap;
import java.util.Map;

public class SquareNum {
	public static void main(String[] args) {
		
		int[] ar= {1,2,3,1,8};
		
		System.out.println(getSquares(ar));
		
	}
	
	static Map<Integer, Integer> getSquares(int[] ar){
		
		Map<Integer, Integer> map=new HashMap<>();
		for(int i:ar) {
			map.put(i, i*i);
		}
		
		return map;
	}
}

