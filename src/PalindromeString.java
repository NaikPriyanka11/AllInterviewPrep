import java.util.Scanner;

public class PalindromeString {
    public static void main(String[] args) {
        Scanner s1 =new Scanner(System.in);
        String a=s1.next();
        String b=a;
        String rev="";
        for(int i=a.length()-1;i>=0;i--) {

            rev = rev + a.charAt(i);
        }
        System.out.println(rev);
        if(b.equals(rev)){
        System.out.println(rev+" This String is Palindrome");}
        else System.out.println(rev+" this is not palindrome String ");
    }
}
