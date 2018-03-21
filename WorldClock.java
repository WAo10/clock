/**
 * PART II.
 * Provide a subclass of Clock namded WorldClock whose constructor
 * accepts a time offset. For example, if you live in California,
 * a new WorldClock(3) should show the time in New York, three
 * time zones ahead. You should not override getTime.
 */
public class WorldClock extends Clock
{
   // Your work goes here
   private int off;
   public WorldClock(int offset)
   {
       super();
       off=offset;
    }
    
   public int getHours()
   {
       int result;
       result = super.getHours();
       result+=off;
       if (result > 24)
       {
           result = result - 24;
        }
       return result;
    }

}
