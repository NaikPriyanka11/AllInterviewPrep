import java.util.Scanner;

public class VolumeOfPyramid {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        int l = s1.nextInt();
        int w=s1.nextInt();
        int h=s1.nextInt();




        double volume = (l*w*h)/3;
        System.out.println(volume);
    }
}


