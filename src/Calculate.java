import java.util.Scanner;

public class Calculate {
    public static void main(String[] args) {
        Scanner s1=new Scanner(System.in);
        System.out.println("Calculator");
        System.out.println("+");
        System.out.println("-");
        System.out.println("*");
        System.out.println("/");
        System.out.println("Enter Your Choice: ");


        int ans=0;
        char ch= s1.next().trim().charAt(0);
        if(ch=='+'|| ch=='-'||ch=='*'||ch=='/'){
            if (ch=='+'){
                System.out.println("Enter Two Number");
                int n1=s1.nextInt();
                int n2=s1.nextInt();
                ans=n1+n1;
                System.out.println("Addition of Two Number is:"+ans);
            }
            if(ch=='-'){
                System.out.println("Enter Two Number");
                int n1=s1.nextInt();
                int n2=s1.nextInt();
                ans=n1-n2;
                System.out.println("Substraction of Two Number is :"+ans);
            }
            if(ch=='*'){
                System.out.println("Enter Two Number");
                int n1=s1.nextInt();
                int n2=s1.nextInt();
                ans=n1*n2;
                System.out.println("Multiplication of Two Number is :"+ans);
            }
            if(ch=='/'){
                System.out.println("Enter Two Number");
                int n1=s1.nextInt();
                int n2=s1.nextInt();
                ans=n1/n2;
                System.out.println("Division of Two NUmber is: "+ans);
            }

        }



    }
}
