package leo.Java.Jsf.day3;

import java.util.Scanner;

public class ReversingTheNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the N  value :");
        int n= sc.nextInt();
        int temp =n;
        int rev =0;
        while (temp !=0){
            int r =temp%10;
            rev=rev*10+r;
            temp/=10;
        }
        System.out.println("Reverse of"+n+" is "+rev);
        if(n ==rev){
            System.out.println("Number is a Palindrome");
        }
        else {
            System.out.println("Number is Not a Palindrome");
        }
    }
}
