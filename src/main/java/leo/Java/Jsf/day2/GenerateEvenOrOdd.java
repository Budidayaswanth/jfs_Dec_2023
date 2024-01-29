package leo.Java.Jsf.day2;

import java.util.Scanner;

public class GenerateEvenOrOdd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the lowest boundary");
        int lb=sc.nextInt();
        System.out.println("Enter the Upper boundary");
        int ub= sc.nextInt();
        for (int i=lb;i<=ub;i++){
            if(i%2==0){
                System.out.println("Even Number :"+i);
            }
            System.out.println("Odd Number :"+i);
        }
    }
}
