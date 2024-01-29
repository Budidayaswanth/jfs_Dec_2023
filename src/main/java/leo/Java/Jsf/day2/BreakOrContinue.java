package leo.Java.Jsf.day2;

public class BreakOrContinue {
    public static void main(String[] args) {
            for (int i=1;i<=20;i++){
                if(i %5==0){
                    //break;
                    continue;
                }
                System.out.println(i);
            }
    }
}
