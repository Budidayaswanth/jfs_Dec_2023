package leo.Java.Jsf.day1;

import java.util.Scanner;

public class EmiCalculator {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Loan Amount :");
        float amount = sc.nextFloat();
        System.out.println("Enter the rate interest ");
        float rate = sc.nextFloat();
        System.out.println(" Enter the duration in month :");
        float t = sc.nextFloat();
         double ri = rate/12/100;
         double emi =amount * ri * (Math.pow(1 + ri , t)/( Math.pow( 1 + ri ,t)-1));
        System.out.println("Enter the EmiCalculator : "+ emi);
        double totalamount = emi * t;
        System.out.println("Amount "+amount);
        System.out.println("Total interest :"+Math.round(totalamount));
    }
}
