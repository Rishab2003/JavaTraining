
public class Factorial {
	public static void main(String[] args) {
		
		CalcFact factCalc=(n)->{
			int ans=1;
			for(int i=1;i<=n;i++) {
				ans*=i;
			}
			return ans;
		};
				
		System.out.println(factCalc.calc(5));
		
		CalcFact fact=MethodReference::calculateFactorial;
		System.out.println(fact.calc(3));
	}
}
