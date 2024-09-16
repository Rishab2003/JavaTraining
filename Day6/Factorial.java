
public class Factorial {
	public static void main() {
		
		CalcFact factCalc=(x)->{
			int ans=1;
			for(int i=1;i<=x;i++) {
				ans*=i;
			}
			return ans;
		};
		
		System.out.println(factCalc.calc(6));
	}
}
