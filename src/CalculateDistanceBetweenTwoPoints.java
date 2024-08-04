import java.util.Scanner;

public class CalculateDistanceBetweenTwoPoints {
    public static void main(String[] args) {
        Scanner s1=new Scanner(System.in);
        double x1=s1.nextDouble();
        double x2=s1.nextDouble();
        double y1=s1.nextDouble();
        double y2=s1.nextDouble();

        double calculate=Math.sqrt(Math.pow((x2-x1),2)+Math.pow((y2-y1),2));

        System.out.println("Distance of Two Points "+calculate);


    }
}
