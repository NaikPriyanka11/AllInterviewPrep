import java.util.Scanner;

public class AreaOfRectangle {
    public static void main(String[] args) {
        Scanner s1=new Scanner(System.in);
        float length=s1.nextInt();
        float width=s1.nextFloat();

        double area;
        area=length*width;
        System.out.println(area);
    }
}
