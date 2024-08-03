import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner s1=new Scanner(System.in);
        System.out.print("Enter Any Number: ");
        int n=s1.nextInt();

        if(n%2==0){
            System.out.println("Given Number is Even Number");
        }
        else {
            System.out.println("Given Number is Odd Number");
        }
    }
}
