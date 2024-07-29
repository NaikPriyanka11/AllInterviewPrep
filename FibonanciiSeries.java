import java.util.Scanner;
public class FibonanciiSeries {
    public static void main(String[] args) {
        Scanner s1=new Scanner(System.in);

        int num= s1.nextInt();
        int a=0, b=1;
        System.out.print(a +" "+b);
        for (int i = 0; i < num; i++) {
            int c;
            c= a+b;
            System.out.print(" "+c);
            a=b;
            b=c;



        }

    }
}
