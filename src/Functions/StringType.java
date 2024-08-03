package Functions;

import java.sql.SQLOutput;
import java.util.Scanner;

public class StringType {
    public static void main(String[] args) {
        Scanner s1= new Scanner(System.in);
        System.out.println("Enter Your Name ");
        String name=s1.next();

        String  msg =Greet(name);
        System.out.println(msg);


    }

    static String Greet(String name){
        String msg="Hello "+name;
        return msg;
    }
}
