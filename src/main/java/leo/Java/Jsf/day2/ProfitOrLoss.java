package leo.Java.Jsf.day2;

import java.util.Scanner;

public class ProfitOrLoss {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the CostPrise is :");
        float cp = sc.nextFloat();
        System.out.println("Enter the Selling Price is :");
        float sp = sc.nextFloat();
        if (cp > sp ){
            float loss =cp -sp;
            System.out.println(" Loss is :" + loss);
        } else if (cp < sp) {
            float profit =sp -cp;
            System.out.println(" Profit is :"+profit);
        }
        else {
            System.out.println(" THERE NO PROFIT OR LOSS BY SELLING PRODUCT");
        }
    }
}
