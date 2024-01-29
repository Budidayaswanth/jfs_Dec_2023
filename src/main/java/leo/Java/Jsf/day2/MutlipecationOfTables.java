package leo.Java.Jsf.day2;

import java.util.Scanner;

public class MutlipecationOfTables {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the lowest boundary");
        int lb = sc.nextInt();
        System.out.println("Enter the Upper  boundary");
        int ub = sc.nextInt();
        for (int num=lb;num<=ub;num++) {

            for (int i = 1; i <= 10; i++) {
                System.out.println(num + " X " + i + " = " + num * i);
            }
            System.out.println("-------------------------");
        }
    }
}
