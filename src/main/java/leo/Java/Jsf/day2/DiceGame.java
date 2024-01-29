package leo.Java.Jsf.day2;

import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

public class DiceGame {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int generatedValue = ThreadLocalRandom.current().nextInt(1,7);
        for (int i=1;i<=3;i++) {
            System.out.println("Guess the Number from(1-6)");
            int userValue = sc.nextInt();

            if (generatedValue == userValue) {
                System.out.println("You won the game");
                break;
            } else {
                if( i==3){
                    System.out.println("You Reached the maximum attempts You Lost the Game ");
                }
                else {
                    System.out.println("Wrong Guess Try again");
                }
            }
        }
    }
}
