import java.util.Scanner;

public class sumofAllNum {
    public static void main(String[] args) {
        Scanner s1=new Scanner(System.in);
        int i=1,sum=0;
        int n=1;
        while(n>0){
             n=s1.nextInt();
            sum=sum+n;
        }
        System.out.println(sum);

    }
}
