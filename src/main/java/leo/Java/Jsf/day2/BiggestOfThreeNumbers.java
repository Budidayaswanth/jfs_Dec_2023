package leo.Java.Jsf.day2;

import java.util.Scanner;

public class BiggestOfThreeNumbers {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the num1 value is :");
        int num1 = sc.nextInt();
        System.out.println("Enter the num2 value is :");
        int num2 = sc.nextInt();
        System.out.println("Enter the num3 value is :");
        int num3 = sc.nextInt();
         int Big ;
         if( num1 >num2 && num1>num3){
             Big =num1;
         } else if (num2 > num3) {
             Big = num2;
         }
         else{
             Big =num1;
         }
        System.out.println("Biggest Number of "+ num1 +", "+num2+" and "+num3+"is :"+Big);
    }
}
