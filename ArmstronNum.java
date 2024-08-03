import java.util.Scanner;

public class ArmstronNum {
    public static void main(String[] args) {
        Scanner s1 =new Scanner(System.in);

        int num1=s1.nextInt();
        int num2=s1.nextInt();

        for(int i=num1;i<num2;i++){
            int armstrong,sum=0,rem;
            armstrong=i;
            while(armstrong!=0){
                rem=armstrong%10;
                sum=sum+rem*rem*rem;
                armstrong=armstrong/10;
            }
            if(sum==i){
                System.out.print(i+" ");
            }
        }


    }
}
