package leo.Java.Jsf.day4;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Enter the num :");
            int num = sc.nextInt();
            System.out.println("Enter the num1 :");
            int num1 = sc.nextInt();
            System.out.println("Enter the choice :");
            int ch = sc.nextInt();
            if (ch == 1) {
                System.out.println("Addition of " + num + " and " + num1 + " is " + (num + num1));
            } else if (ch == 2) {
                System.out.println("Subtraction of " + num + " and " + num1 + " is " + (num - num1));
            } else if (ch == 3) {
                System.out.println("Multiplication of " + num + " and " + num1 + " is " + (num * num1));
            } else if (ch == 4) {
                System.out.println("Modules of " + num + " and " + num1 + " is " + (num % num1));
            } else if (ch == 5) {
                System.out.println("Division of " + num + " and " + num1 + " is " + (num / num1));
            } else if (ch == 6) {
                System.out.println("Thank you for using calculator");
                break;
            } else {
                System.out.println("Invalid Choice");
            }
            ;
            System.out.println("Do you want to continue (y/n)");
            String choice = sc.next();
            if (choice.equals("n")) {
                System.out.println("Thanks for using calculator");
                break;
            }
        }
    }
}
