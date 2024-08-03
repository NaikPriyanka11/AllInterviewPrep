import java.util.Scanner;

public class VolumeOfSphere {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        int r = s1.nextInt();


        double volume = (4.0 / 3.0) * 3.14 * (r * r * r);
        System.out.println(volume);
    }
}
