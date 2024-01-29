package leo.Java.Jsf.day1;

import java.util.Scanner;

public class PowerOfNthNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println(" Enter the m :");
        int m= sc.nextInt();
        System.out.println(" Enter the n :");
        int n= sc.nextInt();
        double pow=Math.pow(m,n);
        System.out.println("The m = "+m+" Power of"+ n+" = "+pow);
    }
}
