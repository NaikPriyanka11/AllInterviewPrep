public class NumOccurance {


    public static void main(String[] args) {

        long n=13857757879l;

        int count=0;
        while(n>0){
            long rem=0;
            rem=n%10;
            if(rem==7){
                count++;
            }
            n=n/10;

        }
        System.out.println(count);
    }
}
