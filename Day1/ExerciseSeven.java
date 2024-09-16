public class ExerciseSeven {
    public static void main(String[] args) {
        System.out.println(checkNumber(788));
    }

    static boolean checkNumber(int num){

        int last=num%10;
        num=num/10;

        while(num>0){
            if(last<num%10){
                return false;
            }
             num=num/10;
        }

        return true;
    }
}
