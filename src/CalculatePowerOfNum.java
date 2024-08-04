import java.util.Scanner;

public class CalculatePowerOfNum {
    public static void main(String[] args) {
        Scanner s1=new Scanner(System.in);
        int n =s1.nextInt();
        int p=s1.nextInt();
        int result=1;
        for(int i=0;i<p;i++){
            result=result*n;
        }
        System.out.println(result);
    }
}
