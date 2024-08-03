import java.util.Scanner;

public class AreaOfRombus {
    public static void main(String[] args) {
        Scanner s1=new Scanner(System.in);
        float base=s1.nextFloat();
        float height=s1.nextFloat();

        double area=base*height;
        System.out.println(area);
    }
}
