import java.util.Scanner;

public class AverageOfN {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);

        int n = s1.nextInt();
        float som = 0;
        for (int i = 0; i < n; i++) {
            int x = s1.nextInt();
            som = (som + x) ;

        }
        float avg=som/n;
        System.out.println(avg);

    }
}
