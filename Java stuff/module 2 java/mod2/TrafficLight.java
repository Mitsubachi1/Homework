/**
   A simulated traffic light.
*/
public class TrafficLight
{
   private int steps;
 
   /**
      Constructs a green traffic light.
   */
   public TrafficLight()
   {
      steps = 0;
   }
 
   /**
      Constructs a traffic light.
      @param initialColor the initial color "green", "yellow", or "red"
   */
   public TrafficLight(String initialColor)
   {
       if (initialColor.equals("green")) {
            steps = 0;
        } 
       else if (initialColor.equals("yellow")) {
            steps = 1;
        } 
       else {
            steps = 2;
   }
   }
   /**
      Moves this traffic light to the next color.
   */
   public void next()
   {
      steps++;
   }
 
   /**
      Returns the current color of this traffic light.
      @return the current color
   */
   public String getColor()
   {
      int color = steps % 3;
      if (color == 0) {
         return "green";
      } 
      else if (color == 1) {
         return "yellow";
      } 
      else {
         return "red";
      }
   }
   
   /**
      Counts how often this traffic light has been red.
      @return the number of times this traffic light has been red
   */
   public int getReds()
   {
      return (steps +2) / 4;
   }
}