import javax.sound.midi.Soundbank;
import javax.swing.plaf.IconUIResource;
import java.util.Scanner;

public class calculator {

    public static void main(String[] args) {
        Scanner s1=new Scanner(System.in);
        System.out.println("*** CALCULATOR ***");
        System.out.println("1. Addition");
        System.out.println("2. Substraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("5. Modulus");
        System.out.println("6. ReverseNumber");
        System.out.println("7. PalindromeNumber");
        System.out.println("8. ArmstrongNumber");
        System.out.println("9. Factorial");
        System.out.println("a. PerfectNumber");
        System.out.println("Press X for exit");


        int ans=0;
        while(true){
            char ch= s1.next().trim().charAt(0);
            if (ch=='1'||ch=='2'||ch=='3'||ch=='4'||ch=='5'||ch=='6'||ch=='7'||ch=='8'||ch=='9'||ch=='a'|| ch=='x'||ch=='X' ){

                if (ch=='1'){
                    System.out.println("Enter Two Numbers");
                    int a=s1.nextInt();
                    int b=s1.nextInt();
                    ans = a+b;
                    System.out.println("Addition of Two Number is "+ans);
                    continue;

                }
                if (ch=='2'){
                    System.out.println("Enter Two Numbers");
                    int a=s1.nextInt();
                    int b=s1.nextInt();
                    ans = a-b;
                    System.out.println("Substraction of 2 Numbers "+ans);
                    continue;

                }
                if (ch=='3'){
                    System.out.println("Enter Two Numbers");
                    int a=s1.nextInt();
                    int b=s1.nextInt();
                    ans = a*b;
                    System.out.println("Multiplication of 2 Numbers "+ans);
                    continue;

                }
                if (ch=='4'){
                    System.out.println("Enter Two Numbers");
                    int a=s1.nextInt();
                    int b=s1.nextInt();
                    ans = a/b;
                    System.out.println("Division of 2 Numbers "+ans);
                    continue;

                }
                if (ch=='5'){
                    System.out.println("Enter Two Numbers");
                    int a=s1.nextInt();
                    int b=s1.nextInt();
                    ans = a%b;
                    System.out.println("Modulus of 2 Numbers "+ans);
                    continue;

                }

 /* Reverse  Number */
                if (ch=='6'){
                    System.out.println("Enter Numbers");
                    int a=s1.nextInt();
                    int sum=0;
                    while(a>0){
                        int rem= a%10;
                        sum=sum*10+rem;
                        a=a/10;
                    }
                    System.out.println(sum);
                    continue;
                }
  /* Palindrome  Number */
                if (ch=='7'){
                    System.out.println("Enter Numbers");
                    int a=s1.nextInt();
                    int x=a;
                    int sum=0;
                    while(a>0){
                        int rem= a%10;
                        sum=sum*10+rem;
                        a=a/10;
                    }
                    if(x==sum){
                        System.out.println("it is palindrome");

                    }
                    else System.out.println("its not a palindrome number");
                    continue;
                }
 /* Armstrong  of Number */
                if (ch=='8'){
                    System.out.println("Enter Numbers");
                    int a=s1.nextInt();
                    int x=a;
                    int sum=0;
                    while(a>0){
                        int rem= a%10;
                        sum=sum+rem*rem*rem;
                        a=a/10;
                    }
                    if(x==sum){
                        System.out.println("Given Number "+sum+" is an armstrong Number");

                    }
                    else System.out.println("Given Number  is not an armstrong Number");
                    continue;

                }


/* Factorial of Number */
                if (ch=='9'){
                    System.out.println("Enter Any Number");
                    int f = s1.nextInt();
                     int fact=1;
                    while(f>0){
                        fact=fact*f;
                        f--;

                    }
                    System.out.println("Factorial of Giver number is "+fact);
                }

   /* Perfect Number */
                if (ch=='a'){
                    int n= s1.nextInt();
                    int sum=0;
                    int x=n;
                    for(int i=1;i<n;i++){
                        if (n%i==0){
                            sum =sum+i;
                        }

                    }
                    if (x==sum){
                    System.out.println(x+" It is a Perfect Number");}
                    else System.out.println(x +" this is not perfect number ");

                }


                if(ch=='x'||ch=='x'){
                    break;
                }

            }

        }


    }
}
