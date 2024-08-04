import java.util.Scanner;

public class CalculateDiscountOfProduct {
    public static void main(String[] args) {
        Scanner s1=new Scanner(System.in);
        System.out.println("Enter the Price of Product");
        int price=s1.nextInt();
        System.out.println("Enter the Discount of Product");
        Float discount=s1.nextFloat();

        double disc=price/100*discount;
        double priceAfterDiscount=price-disc;

        System.out.println("Price After Discount "+priceAfterDiscount);
    }
}
