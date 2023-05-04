public class Time
{
   private int minutesSinceMidnight;
 
   /**
      Initializes a Time object to represent midnight.
   */
   public Time()
   {
        minutesSinceMidnight = 0;
   }


   /**
      Initializes a Time object to represent the given time.
      @param hours the hours component of the time: 0 - 12
      @param minutes the minutes component of the time: 0 - 59
      @param period a string indicating the period of the day: "am" or "pm"
   */
   public Time(int hours, int minutes, String period)
   {
      minutesSinceMidnight = (hours * 60) + minutes;
   }
 
   /**
      Returns the hour component of the time.
      @return the hours as a value between 0 - 12
   */
   public int getHours()
   {
      int hours = minutesSinceMidnight / 60;
      if (hours > 12) { hours = hours - 12; }
      else if (hours == 0) { hours = 12; }
      return hours;
   }
 
   /**
      Returns the minutes component of the time.
      @return minutes as a value between 0 - 59
   */
   public int getMinutes()
   {
      return minutesSinceMidnight % 60;
   }
 
   /**
      Return the period of the day.
      @return a String indicating "am", "pm", "noon" or "midnight"
   */
   public String getPeriod()
   {
      if (minutesSinceMidnight == 0) { return "midnight"; }
      else if (minutesSinceMidnight == 720) { return "noon"; }
      if (minutesSinceMidnight < 720) { return "am"; }
      else { return "pm"; }
   }
}