import java.util.Scanner;

public class LargestFromAll {
    public static void main(String[] args) {
        Scanner s1= new Scanner(System.in);

        int n=1,largest=n;
        while(n>0){
            n=s1.nextInt();
            if(n>largest){
                largest=n;
            }

        }
        System.out.println(largest);
    }
}
