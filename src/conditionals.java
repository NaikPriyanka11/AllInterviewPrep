import java.sql.SQLOutput;
import java.util.*;

public class conditionals {

    public static void main(String[] args) {
        Scanner s1=new Scanner(System.in);
//        int i =s1.nextInt();
//
//        for (int a=0;a<i;a++){
//            System.out.println(a);
//        }

//        find the Largest number from a b and c

        int a=s1.nextInt();
        int b=s1.nextInt();
        int c=s1.nextInt();
       /* if (a>b){
            if (a>c){
                System.out.println(a);


            }

        } else if (b>c) {
            System.out.println(b);


        }
        else {
            System.out.println(c);
        }

         */

        int max= Math.max(c,Math.max(a,b));
        System.out.println(max);



    }
}
