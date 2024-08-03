package Functions;
import java.util.*;


public class SumOfNum {
    public static void main(String[] args) {

        sum();
        int ans=Addition();
        System.out.println(ans);

    }
/* with return type whatever we add after retuen type it assume as a not usable and it will not print*/
    static int Addition(){
        Scanner s1= new Scanner (System.in);
        int num1=s1.nextInt();
         int num2=s1.nextInt();
         int sum=num1+num2;
         return sum;

    }
    /*
    Without Return Type Static keyword is used because whenever we used static keyword we don't need to create that object */
    static void sum(){
        Scanner s1= new Scanner (System.in);
        int n=s1.nextInt();
        int n2=s1.nextInt();
        int sum =n+n2;
        System.out.println(sum);
    }


}
