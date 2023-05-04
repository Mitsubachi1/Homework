package IA;

import java.util.NoSuchElementException;

// Complete the implementation of your MyLinkedList class in this file


public class MyLinkedList implements MyList {
    // Implement the required fields and methods here
    private Node head= null;
    private int size= 0;
    
    
        
        public void addToEnd(Object o){
            Node node = new Node();
            node.data = o;
            if (head == null){
                head = node;
            }
            else{
                Node nextNode = head;
                while(nextNode.next != null){
                    nextNode = nextNode.next;
                }
                nextNode.next = node;
            }
            size++;
        }
        public void insertAt(int index, Object o){
            Node node = new Node();
            node.data = o;
            if (index < 0 || index > size){throw new NoSuchElementException();}
            if(index == 0){
                node.next = head;
                head = node;
            }           
            else{
                Node previousNode = head;
                for (int i = 0; i < index - 1; i++) {
                    previousNode = previousNode.next;
                }
                node.next = previousNode.next;
                previousNode.next = node;
            }
            size++;

        }
        public void removeAt(int index){
            if (index < 0 ||index >= size){throw new NoSuchElementException();} 

           if(index == 0){
            head = head.next;
           }
           else{
                Node prev = head;
            for(int i = 0; i < index-1; i++){
                prev = prev.next;

            }
            prev.next = prev.next.next;
        
            
        }
            size--;
            

        }
        public Object getAt(int index){
            if (index < 0 || index >= size){throw new NoSuchElementException();}

            Node node = head;
            for(int i = 0; i < index; i++){
                node = node.next;

            }
            return node.data;

        }
        public int getSize(){

            return size;
        }
    

   
     
   
	// Do not alter the code below 
	
	public MyListIterator getIterator() {
		return new MyLinkedListIterator();
	}
	
	private class MyLinkedListIterator implements MyListIterator {
		Node currentNode = null;

		@Override
		public Object next() {
			if (currentNode != null)
				currentNode = currentNode.next;
			else
				currentNode = head;

			return currentNode.data;
		}

		@Override
		public boolean hasNext() {
			if (currentNode != null)
				return currentNode.next != null;
			else
				return head != null;
		}
	}
	
	class Node {
		public Object data = null;
		public Node next = null;
	}
}