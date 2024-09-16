
public class Power {
	public static void main(String[] args) {
		
		CalcPower calcPower=(x,y)->{
			
			return Math.pow(x, y);
		};
		System.out.println(calcPower.calc(2.1, 3.5));
		
		//method refernece from Math.pow()
		CalcPower calcPower2=Math::pow;
		System.out.println(calcPower2.calc(2, 2));
		
	}
}
