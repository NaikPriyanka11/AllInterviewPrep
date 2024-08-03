import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner  s1=new Scanner(System.in);
        String word =s1.next();

         String word1;
        word1 = reverseString(word);
        System.out.println(word1);
    }
     public static String  reverseString(String input){
        String reverse= "";
        for (int i=input.length()-1;i>=0;i--){
            reverse +=input.charAt(i);


        }
        return reverse;
    }
}
