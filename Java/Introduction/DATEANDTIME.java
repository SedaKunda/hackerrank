Knowledge of Calender Class in Java
/**
 * The Calendar class is an abstract class that provides methods for converting between a specific instant in time and a set of calendar fields such as YEAR, MONTH, DAY_OF_MONTH, HOUR, and so on, and for manipulating the calendar fields, such as getting the date of the next week.
 * <p>
 * You are given a date. You just need to write the method, , which returns the day on that date. To simplify your task, we have provided a portion of the code in the editor.
 * <p>
 * For example, if you are given the date , the method should return  as the day on that date.
 * <p>
 * image
 * <p>
 * Input Format
 * <p>
 * A single line of input containing the space separated month, day and year, respectively, in    format.
 * <p>
 * Constraints
 * <p>
 * Output Format
 * <p>
 * Output the correct day in capital letters.
 * <p>
 * Sample Input
 * <p>
 * 08 05 2015
 * Sample Output
 * <p>
 * WEDNESDAY
 * Explanation
 * <p>
 * The day on August th  was WEDNESDAY.
 */
import java.io.*;
import java.util.*;
import java.time.LocalDate;
public class DATEANDTIME 
{
public static void main(String args[])throws IOException
{
	 BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
     BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

     String[] MultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

     int month = Integer.parseInt(MultipleInput[0]);

     int day = Integer.parseInt(MultipleInput[1]);

     int year = Integer.parseInt(MultipleInput[2]);

     String res = FIND_DAY.findDay(month, day, year);

     bufferedWriter.write(res);
     bufferedWriter.newLine();

     bufferedReader.close();
     bufferedWriter.close();
}
}
class FIND_DAY{

    public static String findDay(int month, int day, int year) {
        Calendar c = Calendar.getInstance();//creating instance of abstract class calender
        c.set(year, month, day);//calender format is set to yyyy-mm-dd
        return LocalDate.of(year, month, day).getDayOfWeek().toString();//we are using LocalDate Class (immutable)with format set to yyyymmdd using method LocalDate.of(int,int,int)
        

    }

}
