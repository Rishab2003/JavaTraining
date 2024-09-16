public class DIfferenceSum {
    public static void main(String[] args) {
        System.out.println(calculateDifference(3));
        
    }

    static int calculateDifference (int n){
        
        int Sqsum=0;
        int sum=0;

        for(int i=1;i<=n;i++){
            Sqsum+=Math.pow(i, 2);
            sum+=i;
        }

        return Sqsum-(int)Math.pow(sum, 2);
    }
}
