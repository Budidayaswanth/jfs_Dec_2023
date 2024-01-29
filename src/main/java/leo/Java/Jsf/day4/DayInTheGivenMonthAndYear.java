package leo.Java.Jsf.day4;

public class DayInTheGivenMonthAndYear {
    public static void main(String[] args) {
        int month =2;
        int year =2020;
        int days =DayInMonths(month,year);
        System.out.println("Days in month :"+ month +" and year "+ year + " is "+ days);
    }
    private  static int DayInMonths(int month, int year){
      /*  if(month ==1 || month == 3 || month ==5 || month == 7 || month ==8 || month ==10 || month ==12){
            return 31;
        } else if (month ==4 || month == 6 || month ==9 || month ==11) {
            return 30;
        } else if (month ==2) {
            if (isLeapYear(year)){
                return 29;
            }
            else {
                return 28;
            }
            
        }*/
        return switch(month) {
            case 1, 3, 5, 7, 8, 10, 12 -> 31;
            case 4, 6, 9, 11 -> 30;
            case 2 -> isLeapYear(year) ? 29 : 28;
            default -> throw new IllegalArgumentException("Invalid month "+month);
        };

    }
    private static boolean isLeapYear(int year){
        return (year % 4 ==0 && year %100 !=0) || year %400 ==0;
    }
}
