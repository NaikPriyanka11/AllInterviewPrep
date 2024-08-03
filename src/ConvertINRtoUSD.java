import java.util.Scanner;

public class ConvertINRtoUSD {
    public static void main(String[] args) {
        Scanner s1=new Scanner(System.in);
        System.out.println("Enter Your Indian Currency");
        float inr=s1.nextFloat();
        double usd=0;
        usd=inr*0.012;
        System.out.format("%.4f",usd);

    }
}
