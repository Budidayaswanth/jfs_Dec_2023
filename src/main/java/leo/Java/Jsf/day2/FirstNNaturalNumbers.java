package leo.Java.Jsf.day2;

import java.util.Scanner;

public class FirstNNaturalNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the n value :");
        int n= sc.nextInt();
       // int sum =n*(n+1)/2;

          int sum =0;
       for (int i=n;i>=1;i--){
            sum +=i;
        }
        System.out.println("Sum of First "+n+" Natural Numbers are :"+sum);
    }
}
