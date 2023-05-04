/**
   A simulated lock with digit buttons.
*/
public class Lock
{
   private int combination = 1729; 
   private int input;
 
   /**
      Simulates a digit button push.
      @param button a digit 0 ... 9
   */
   public void push(int button)
   {
    String in = Integer.toString(button);
    String  prev = Integer.toString(input);
    String combine = prev + in; 
      input = Integer.parseInt(combine);
   }
   
   /**
      Simulates a push of the open button.
      @return true if the lock opened
   */
   public boolean open()
   {
      if (input == combination){
        input = 0;
        return true;
    }
      else{
        input = 0;
        return false;
    }
   }
}