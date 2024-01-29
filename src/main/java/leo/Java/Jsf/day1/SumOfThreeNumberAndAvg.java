package leo.Java.Jsf.day1;

import java.util.Scanner;

public class SumOfThreeNumberAndAvg {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the NUmber a =");
        int a= sc.nextInt();
        System.out.println("Enter the NUmber b =");
        int b= sc.nextInt();
        System.out.println("Enter the NUmber c =");
        int c= sc.nextInt();
        int sum= a+b+c;
        int avg=sum/3;
        System.out.println("Sum of a ="+a+" " +" b= "+b+" and c= "+c+" = "+sum);
        System.out.println("Avarage of three Number is :" + avg);

    }
}
