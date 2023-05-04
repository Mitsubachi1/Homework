package Activities;
import java.util.NoSuchElementException;

/**
   An implementation of a stack as a sequence of nodes.
*/
public class LinkedListStack
{
   private Node first;

   /**
      Constructs an empty stack.
   */
   public LinkedListStack()
   {
      first = null;
   }

   /**
      Returns the top of the stack, but doesn't remove it.
      @return the top of the stack.
   */

   /* Your code goes here */
   public String peek(){
    if (first == null){ throw new NoSuchElementException();}
    String front = first.data.toString();
    return front;
   }

   /**
      Adds an element to the top of the stack.
      @param element the element to add
   */
   public void push(Object element)
   {
      Node newNode = new Node();
      newNode.data = element;
      newNode.next = first;
      first = newNode;
   }

   /**
      Removes the element from the top of the stack.
      @return the removed element
   */
   public Object pop()
   {
      if (first == null) { throw new NoSuchElementException(); }
      Object element = first.data;
      first = first.next;
      return element;
   }

   /**
      Checks whether this stack is empty.
      @return true if the stack is empty
   */
   public boolean empty()
   {
      return first == null;
   }

   class Node
   {
      public Object data;
      public Node next;
   }
}
