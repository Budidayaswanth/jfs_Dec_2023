package leo.Java.Jsf.day2;

import javax.crypto.spec.PSource;
import java.util.Scanner;

public class AsignBillGenarater {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the Name :");
        String name = sc.nextLine();
        System.out.println("Enter the Bill Amount is :");
        int BillAmount = sc.nextInt();
        float discount = 0;
        if(BillAmount >= 5000){
            discount =BillAmount*0.1f;

        } else if (BillAmount < 5000) {
            discount = BillAmount*0.05f;
        }
        Float NetAmount =BillAmount-discount;
        System.out.println("BIll Amount = "+BillAmount);
        System.out.println("Discount is : "+discount);
        System.out.println("After the Discount Amount = "+NetAmount);

    }
}
