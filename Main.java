import java.util.*;
import java.text.*;

public class Main {
    
    public static boolean isDateValid(String strDate, String format){
        try{
            SimpleDateFormat sdf = new SimpleDateFormat(format);
            sdf.setLenient(true);
            sdf.parse(strDate);
            return true;
        }catch (Exception e){
            return false;
        }
    }

    public static void main(String[] args) {

            Date currDate = new Date();
            SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy  HH:mm:ss");  //current date and time
            System.out.println("Current Day: " + sdf.format(currDate));
            
            try{
                String stringDates = "11/28/1997";
                SimpleDateFormat sdfBirth = new SimpleDateFormat("MM/dd/yyyy");  //string to date
                Date birthday = sdfBirth.parse(stringDates);
                SimpleDateFormat sdfBirth1 = new SimpleDateFormat("MM-dd-yyyy");
                System.out.println("Birthdate: " + sdfBirth1.format(birthday));
                
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
            
            Calendar m = Calendar.getInstance();            //creating calendar
            m.setTime(new Date());
            System.out.println("Day: " + m.get(Calendar.DAY_OF_MONTH));
            System.out.println("Year: " + m.get(Calendar.YEAR));
            System.out.println("Month: " + (m.get(Calendar.MONTH) + 1));
            System.out.println("Seconds: " + m.get(Calendar.SECOND));
            System.out.println("Minutes: " + m.get(Calendar.MINUTE));
            System.out.println("Hours: " + m.get(Calendar.HOUR));
            
            if(isDateValid("11/28/1997", "MM/dd/yyyy"))
                System.out.println("Date = Valid");
            else
                System.out.println("Date = Invalid");
        }
    }
