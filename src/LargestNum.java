import java.util.Scanner;

public class LargestNum {
    public static void main(String[] args) {
        Scanner s1=new Scanner(System.in);
        System.out.println("Enter Any Two Numbers");
        int n1=s1.nextInt();
        int n2=s1.nextInt();

        if(n1>n2){
            System.out.println(n1+" is Greater ");
        }
        else System.out.println(n2+" is Greater");
    }
}
