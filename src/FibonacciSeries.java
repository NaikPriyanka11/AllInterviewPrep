import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner s1=new Scanner(System.in);
        int n=s1.nextInt();
        int a=0,b=1;
        int c;
        System.out.print(a+" "+b);
        int i=0;

        while(i<n){

            c=a+b;
            System.out.print(" "+c);
            a=b;
            b=c;
            i++;
        }



    }
}
