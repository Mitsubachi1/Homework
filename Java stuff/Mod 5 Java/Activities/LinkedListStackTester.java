package Activities;
public class LinkedListStackTester
{
   public static void main(String[] args)
   {
      LinkedListStack s = new LinkedListStack();
      s.push("Tom");
      s.push("Diana");
      s.push("Harry");

      System.out.println(s.peek());
      System.out.println("Expected: Harry");
      System.out.println(s.pop());
      System.out.println("Expected: Harry");
      System.out.println(s.pop());
      System.out.println("Expected: Diana");
      System.out.println(s.peek());
      System.out.println("Expected: Tom");

      while (!s.empty()) { s.pop(); }

      Object result = null;
      try
      {
         result = s.peek();
      }
      catch (Exception e)
      {
         result = e.getClass().getSimpleName();
      }
      System.out.println(result);
      System.out.println("Expected: NoSuchElementException");
   }
}