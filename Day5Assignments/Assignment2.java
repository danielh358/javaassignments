//date time section
import java.time.LocalDate;
import java.time.Month;
import java.time.Year;
import java.time.YearMonth;
import java.time.MonthDay;
import java.util.Random;
import java.util.ArrayList;
import java.util.Arrays;
public class Assignment2 {
/*
The first part is answering questinons. They are below.

1.	 Which class would you use to store your birthday in years, months, days, seconds, and nanoseconds?
LocalDateTime
2.	 Given a random date, how would you find the date of the previous Thursday?
First, I would use the getDayofWeek function on the date object. Then I would determine how many days it would be to the
previous Thursday, and adjust accordingly.
3.	 What is the difference between a ZoneId and a ZoneOffset?
ZoneID has the time zone and how to get to it from an Instant.
ZoneOffset is the offset from GMT.
4.	 How would you convert an Instant to a ZonedDateTime? How would you convert a ZonedDateTime to an Instant?
The ZonedDateTime class has functions for conversion.

Now are the actual coding questions. 
*/
    public static void main(String[] args){    
//5.	 Write an example that, for a given year, reports the length of each month within that year.
        Random ranyear = new Random();
        int randyear = ranyear.nextInt(2100);
        System.out.printf("The year is %d%n\n", randyear);
        for(int i = 1; i < 13; i++){
            YearMonth current = YearMonth.of(randyear,i);
            System.out.println(current.lengthOfMonth());

        }
//6.	 Write an example that, for a given month of the current year, lists all of the Mondays in that month.
        YearMonth now = YearMonth.now();
        for(int i =1; i < now.lengthOfMonth(); i++){
            MonthDay temp = MonthDay.of(now.getMonth(), i);
            if(temp.atYear(now.getYear()).getDayOfWeek().getValue() == 1){
                System.out.printf("Day number %d is a Monday. Sorry Garfield. \n", i);
                
            }
        }

//7.	 Write an example that tests whether a given date occurs on Friday the 13th.
        LocalDate testing = LocalDate.now();

        if(testing.getDayOfWeek().getValue() == 5 && testing.getDayOfMonth() == 13){
            System.out.println("Oooh spooky, today is Friday the 13th!");
        }

    }
}
