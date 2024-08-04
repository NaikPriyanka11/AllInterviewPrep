import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner s1=new Scanner(System.in);


        int n=s1.nextInt();
        int fact=1;

        while(n>0){
            fact=fact*n;
            n--;

        }
        System.out.println(fact);
    }
}
