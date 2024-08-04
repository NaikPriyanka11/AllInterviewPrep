import java.util.Scanner;

public class FactorsOfNum {
    public static void main(String[] args) {
        Scanner s1=new Scanner(System.in);
        System.out.println("Enter Any Number");
        int n=s1.nextInt();

        for(int i=1;i<n;i++){
            if(n%i==0){
                System.out.print(i+" ");
            }
        }
    }
}
