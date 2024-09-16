public class Divisibility{
    public static void main(String[] args) {
        int ans=calculateSum(10);
        System.out.println(ans);
    }

    static int calculateSum (int n){

        int tsum=0;
        
        for(int i=1;i<=n;i++){
         
            if(i%5==0 || i%3==0){
                tsum+=i;
            }
        }
        return tsum;
    }

}