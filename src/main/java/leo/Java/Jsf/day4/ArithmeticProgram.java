package leo.Java.Jsf.day4;

public class ArithmeticProgram {
    public static int addition(int a,int b){
        return a+b;
    }

    public static int Subtraction(int a,int b){
        return a-b;
    }

    public static int division(int a, int b){
        return a/b;
    }
    public static int modules(int a, int b){
        return a % b ;
    }

    public static void main(String[] args) {
        int a =5;
        int b=4 ;
        System.out.println(addition(a,b));
        System.out.println(Subtraction(a,b));
         //ArithmeticProgram ar=new ArithmeticProgram();
        System.out.println(division(a,b));
        System.out.println(modules(a,b));



    }

}
