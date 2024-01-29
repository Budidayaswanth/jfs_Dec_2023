package leo.Java.Jsf.day1;

import java.util.Scanner;

public class SumOfTwoNumbers {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the Number N :");
        int n = sc.nextInt();
        System.out.println("Enter the Number M :");
        int m = sc.nextInt();
        int sum=n+m;
        System.out.println("Sum of "+n+ " Plus "+m+" is Equals to "+sum);
    }
}
