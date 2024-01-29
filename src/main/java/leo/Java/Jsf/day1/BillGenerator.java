package leo.Java.Jsf.day1;

import java.util.Scanner;

public class BillGenerator {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the BillAmount :");
        float amount = sc.nextFloat();
        float discount=0;
        if (amount >=5000){
            discount=amount*0.1f;
        }
        else {
            System.out.println("Bill Amount is :"+amount);
        }
        double NetAmount =amount-discount;
        System.out.println("Bill amount is :"+amount+"  Discount is "+discount+" Net Amount is "+NetAmount);
    }
}
