package leo.Java.Jsf.day2;

public class BiggestOfTwoNumbers {
    public static void main(String[] args) {
        int a=10;
        int b=12;
        int big=0;
      /*  if(a>b){
            big =a;
        }
        else{
            big =b;
        }*/
        big =(a>b) ? a:b;
        System.out.println(big);
    }
}
