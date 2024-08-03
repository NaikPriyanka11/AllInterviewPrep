import java.util.Scanner;

public class AreaOfTriangle {
    public static void main(String[] args) {
        Scanner s1= new Scanner(System.in);
        int b=s1.nextInt();
        int h=s1.nextInt();

        double area;
        area=0.5*b*h;
        System.out.println(area);
    }
}
