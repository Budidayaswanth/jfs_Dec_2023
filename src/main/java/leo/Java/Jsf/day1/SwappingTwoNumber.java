package leo.Java.Jsf.day1;

public class SwappingTwoNumber {
    public static void main(String[] args) {
        int a=10;
        int b=20;
        System.out.println("Before Swapping a = "+a+" and b = "+b);
        int temp =a;
        a=b;
        b=temp;

       /* a=a+b;
        b=a-b;
        a=a-b;*/
        System.out.println("After Swapping a = "+a+" and b = "+b);
    }
}
