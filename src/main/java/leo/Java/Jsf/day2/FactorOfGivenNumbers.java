package leo.Java.Jsf.day2;

public class FactorOfGivenNumbers {
    public static void main(String[] args) {
       for( int num=1; num <=100;num++) {
           int count = 0;
           System.out.println("Factor Of "+num+"are :");
           for (int i = 1; i <= num; i++) {
               if (num % i == 0) {
                   count++;
                   System.out.println(i);
               }
           }
           if(count ==2 ){
               System.out.println("It IS a PrimeNumber "+num);
           }
           else {
               System.out.println("It is Not A Prime Numbers "+num);
           }
           System.out.println("------------------------");
       }
    }
}
