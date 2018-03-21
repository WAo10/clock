/**
 * Tests the Clock class.
 */
public class ClockDemo
{
   public static void main(String[] args)
   {
      //test Clock
      int hours = 10; int min = 25;
      System.out.println("Testing Clock class");
      Clock clock = new Clock();
      System.out.println("Hours: " + clock.getHours());
      System.out.println("Minutes: " + clock.getMinutes());
      System.out.println("Time: " + clock.getTime());
      System.out.println("ALARM SET FOR "+hours+":"+min);
      System.out.println(clock.setAlarm(hours,min));
   }
}
