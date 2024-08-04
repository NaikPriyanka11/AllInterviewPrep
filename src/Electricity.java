import java.util.Scanner;

public class Electricity {
    public static void main(String[] args) {
        Scanner s1= new Scanner(System.in);

        double electricityCost;
        float electricityConsumpution=s1.nextFloat();


        if(electricityConsumpution<100){
            electricityCost=electricityConsumpution*10;
            System.out.println(electricityCost);
            
        } else if (electricityConsumpution>=100 && electricityConsumpution<=200) {
            electricityCost=(100*10)+(electricityConsumpution-100)*15;
            System.out.println(electricityCost);

        } else if (electricityConsumpution>=200 && electricityConsumpution<=300 ) {
            electricityCost=(100*10)+(100*15)+(electricityConsumpution-200)*20;
            System.out.println(electricityCost);
        }
        else if (electricityConsumpution>=300){
            electricityCost=(100*10)+(100*15)+(100*20)+(electricityConsumpution-300)*25;
            System.out.println(electricityCost);
        }

    }
}
