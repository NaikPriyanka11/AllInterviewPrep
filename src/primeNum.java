public class primeNum {
    public static void main(String[] args) {
        int num=7;
        int i;
        for( i =2;i<num;i++){
            if(num%i==0){
                System.out.println("given number is not prime number");
                break;
            }

            }
        if (num==i){
            System.out.println("prime");
        }
    }
}
