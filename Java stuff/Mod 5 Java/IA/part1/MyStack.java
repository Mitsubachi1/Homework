package IA.part1;
import java.util.NoSuchElementException;



public class MyStack implements IStack {
	// add any necessary variables here
    private Node first = null;
    private int size;
	@Override
	public void push(Object item) {
        //send to top of stack
            Node node = new Node();
            node.data = item;
            node.next = first;
            first = node;
        size++;
	}

	@Override
	public Object pop() {
        if(first == null){throw new NoSuchElementException();}
        Object remove = first.data;
        first = first.next;
        size--;
        return remove;
    
	}

	@Override
	public Object peek() {
        if (first == null){throw new NoSuchElementException();}
        return first.data;
	}
 
	@Override
	public int indexOf(Object item) {
        Node val = first; //declare node
        for(int i = 0; i < size; i++){
             // move head as it goes on, return if it equals object
            if(val.data.equals(item)){return i;}
            else {val = val.next;}
        }
        return -1;
	}

	@Override
	public int size() {
        return size;
	}

	@Override
	public boolean isEmpty() {
        return first == null;
	}

    public class Node {
        public Object data;
        public Node next;
    }
	// add any necessary methods or classes below
}
