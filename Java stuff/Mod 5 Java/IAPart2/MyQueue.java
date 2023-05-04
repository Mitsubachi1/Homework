package IAPart2;


// Complete the implementation of your MyArrayList class in this file
import java.util.NoSuchElementException;

public class MyQueue implements IQueue {
	// add any necessary variables here
    private Node first = null;
    private Node last = null;
    private int size = 0;
	@Override
    public void enqueue(Object item) {
        Node newNode = new Node();
        newNode.data = item;
        if (last == null) {
            first = newNode;
            last = newNode;
        } else {
            last.next = newNode;
            last = newNode;
        }
        size++;
    }

	@Override
	public Object dequeue() {
	     if(last == null && first == null){throw new NoSuchElementException();}
        Object val = first.data; // get first and store it in data
        first = first.next; //switch to next in queue
        size--;
        return val; //return stored first that DNE
	}

	@Override
	public Object peek() {
        if (last == null){throw new NoSuchElementException();}
        return first.data;
	}


	@Override
	public int indexOf(Object item) {
	   Node newNode = first;
       for(int i = 0; i < size; i++){ //declare node
             // move tail as it goes on, return if it equals object
            if(newNode.data.equals(item)){return i;}
            newNode = newNode.next;
        }
        return -1;
	}

	@Override
	public int size() {
        return size;    
	}

	@Override
	public boolean isEmpty() {
        return last == null;
	}

	// add any necessary methods or classes below
class Node
   {
      public Object data;
      public Node next;
   }
}

