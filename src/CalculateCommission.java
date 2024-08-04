import java.util.Scanner;

public class CalculateCommission {
    public static void main(String[] args) {
        Scanner s1=new Scanner(System.in);
        double amount=s1.nextDouble();
        double TotalSale=s1.nextDouble();

        double CommRate;
        CommRate=(TotalSale/100)*amount;
        System.out.println(CommRate);
    }
}
