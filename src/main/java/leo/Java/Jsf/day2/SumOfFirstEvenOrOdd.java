package leo.Java.Jsf.day2;

import java.util.Scanner;

public class SumOfFirstEvenOrOdd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the n number :");
        int n= sc.nextInt();
        int EvenSum=0;
        int OddSum=0;
        for(int i=1;i<=n;i++){
            if(i%2==0){
                EvenSum += i;
            }
            else {
                OddSum += i;
            }
        }
        System.out.println("Sum Of The First "+n+"Even Number is "+EvenSum);
        System.out.println("Sum Of The First "+n+"Odd Number is "+OddSum);
    }
}
