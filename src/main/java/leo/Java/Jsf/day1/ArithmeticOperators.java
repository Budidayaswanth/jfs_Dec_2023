package leo.Java.Jsf.day1;

import java.util.Scanner;

public class ArithmeticOperators {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the A is: ");
        int a= sc.nextInt();
        System.out.println("Enter the B is: ");
        int b= sc.nextInt();
        System.out.println("Adding of "+a+" and "+ b+" = "+(a+b));
        System.out.println("Subtraction of "+a+" and "+ b+" = "+(a-b));
        System.out.println("Multiplication of "+a+" and "+ b+" = "+(a*b));
        System.out.println("Division of "+a+" and "+ b+" = "+(a/b));
        System.out.println("Modules of "+a+" and "+ b+" = "+(a%b));

    }
}
