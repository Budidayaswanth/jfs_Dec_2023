package leo.Java.Jsf.day4;

public class MountNameOfGivenMount {
    public static void main(String[] args) {

    }
    private static String MonthName(int month){
        String monthname="";
        switch (month){
            case 1:
                monthname ="January";
                break;
            case 2:
                monthname ="February";
                break;
            case 3:
                monthname ="March";
                break;
            case 4:
                monthname ="April ";
                break;
            case 5:
                monthname="May";
                break;
            case 6:
                monthname ="June";
                break;
            case 7:
                monthname = "July";
                break;
            case 8:
                monthname = "August";
                break;
            case 9:
                monthname ="September";
                break;
            case 10:
                monthname= "October";
                break;
            case 11:
                monthname = "November";
                break;
            case 12:
                monthname = "December";
                break;
            default:
              throw new  IllegalArgumentException ("Invalid Month");
        }
        return monthname;
    }
}
