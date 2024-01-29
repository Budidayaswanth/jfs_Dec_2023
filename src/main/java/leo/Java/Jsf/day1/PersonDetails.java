package leo.Java.Jsf.day1;

import java.util.Scanner;

public class PersonDetails {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Name :");
        String name = sc.nextLine();
        System.out.println("Enter the age :");
        int age = sc.nextInt();
        if (age<=0){
            age=-age;
        }
        System.out.println("Name is "+name+" and Age is :"+age);
    }
}
