import java.sql.SQLOutput;
import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner s1=new Scanner(System.in);
        System.out.println("Enter a Details to find out a Simple Interest");
        System.out.println("Principle");
        int principle=s1.nextInt();
        System.out.println("Number of Years");
        int time=s1.nextInt();
        System.out.println("Rate of Interest");
        int rateofInterest=s1.nextInt();

        int SI;

        SI=(principle*rateofInterest*time)/100;
        System.out.println("Simple Interest: "+SI);
    }
}
