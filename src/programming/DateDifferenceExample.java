package programming;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDifferenceExample {

    public static void main(String[] args)
    {

        String joinDate = "12-12-2015 01:11:20";
        String leaveDate  = "1-26-2021 09:15:50";

        findDate(joinDate, leaveDate);
    }

    static void findDate(String joinDate, String leaveDate){
        SimpleDateFormat obj = new SimpleDateFormat("MM-dd-yyyy HH:mm:ss");
        try{
            Date date1= obj.parse(joinDate);
            Date date2= obj.parse(leaveDate);
            long timeDifference = date2.getTime() - date1.getTime();   //In mili seconds

            long seconds_difference = (timeDifference / 1000)% 60;
            long minutes_difference = (timeDifference / (1000*60)) % 60;
            long hours_difference = (timeDifference / (1000*60*60)) % 24;
            long days_difference = (timeDifference / (1000*60*60*24)) % 365;
            long years_difference = (timeDifference / (1000l*60*60*24*365));

            System.out.print("Difference between two dates is: ");
            System.out.print(seconds_difference + " seconds,");
            System.out.print(minutes_difference + " minutes, ");
            System.out.print(hours_difference + " hours, ");
            System.out.print(days_difference + " days, ");
            System.out.print(years_difference + " years, ");

        }catch (ParseException exception){
            exception.printStackTrace();
        }



    }
}
