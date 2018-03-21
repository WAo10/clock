import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
/**
   Part I: Implement a class Clock whose getHours, getMinutes and
   getTime methods return the current time at your location.
   Return the time as a string.

   There are two ways to retrieve the current time as a String:

   1) Before Java 8 use new Date().toString()
   2) With Java 8, you can use 3 classes in the java.time package:
      Instant, LocalDateTime and ZoneId. Here's how you do it:
      String timeString = LocalDateTime.ofInstant(Instant.now(),
                              ZoneId.systemDefault()).toString()

   With either method, you'll need to extract the hours and
   minutes as a substring.
*/
import java.text.DecimalFormat;
import java.time.*;
import java.lang.*;
public class Clock
{
   // Your work goes here
   private DecimalFormat dec = new DecimalFormat("00");
   private String time;
   public Clock(){
       time = LocalDateTime.ofInstant(Instant.now(), ZoneId.systemDefault()).toString();
    }

    public String getTime()
    {
        return getHours()+":"+dec.format(getMinutes());
    }
    
    public int getHours()
    {
        return Integer.parseInt(time.substring(11, 13));
    }
    
    public int getMinutes()
    {
        return Integer.parseInt(time.substring(14, 16));
    }

    public String setAlarm(int hours, int minutes)
    {
        boolean bool = true;
        while(bool==true)
        {
            if(getHours()==hours && getMinutes()==minutes)
            {
                bool=false;
            }
        }
        return getTime();
    }








}
