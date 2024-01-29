package leo.Java.Jsf.day3;

public class SumOfGivenDigits {
    public static void main(String[] args) {
        int n=9879;
        int temp =n;
        int sum=0;
        while(temp !=0){
            int r =temp % 10;
            sum +=r;
            temp/=10;
        }
        System.out.println("Sum of the Digits of :"+n+" is "+sum);
    }
}
