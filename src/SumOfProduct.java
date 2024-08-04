import java.util.Scanner;

public class SumOfProduct {
    public static void main(String[] args) {
        Scanner s1=new Scanner(System.in);

        int n=s1.nextInt();
        int  sum=0,rem,product=1;
        while(n>0)
        {
            rem=n%10;
            product=product*rem;
            sum=sum+rem;
            n=n/10;


        }
        System.out.println("Product of Given Number is "+product);
        System.out.println("Sum of Given Number is "+sum);
        int diff=product-sum;
        System.out.println("Difference Between Two Numbers "+diff);

    }
}
