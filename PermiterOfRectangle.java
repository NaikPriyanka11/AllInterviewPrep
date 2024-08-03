import java.util.Scanner;

public class PermiterOfRectangle {
    public static void main(String[] args) {
        Scanner s1=new Scanner(System.in);
        float length =s1.nextFloat();
        float width=s1.nextFloat();

        double area =2* (length+width);
        System.out.println(area);
    }
}
