import java.util.Scanner;

public class AreaOfIsosceles {
    public static void main(String[] args) {
        Scanner s1=new Scanner(System.in);
        float base=s1.nextFloat();
        float hight=s1.nextFloat();

        double area;
        area= (0.5)*base*hight;
        System.out.println(area);
    }
}
