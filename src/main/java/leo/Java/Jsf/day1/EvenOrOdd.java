package leo.Java.Jsf.day1;

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the n Value :");
        int n = sc.nextInt();
        if (n % 2 == 0){
            System.out.println("It is a Even NUmber is :"+n);
        }
        else {
            System.out.println("It is a Odd NUmber is :"+n);
        }
    }
}
