import java.util.*;
public class SwitchCase {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
//        int num=s1.nextInt();
//        switch (num) {
//            case 1 -> System.out.println("Monday");
//            case 2 -> System.out.println("Tuesday");
//            case 3 -> System.out.println("Wednesday ");
//            case 4 -> System.out.println("thursday ");
//            case 5 -> System.out.println("friday ");
//            case 6 -> System.out.println("weekend ");
//            default -> System.out.println("enter correct choice");
//        }

        String choice = s1.next();

        switch (choice) {
            case "mango" -> System.out.println("fruit king");

            case "orange" -> System.out.println("citric fruit");

            case "apple" -> System.out.println("keeps doctor away");
            default -> System.out.println("Enter Correct Choice");


        }
    }

}
