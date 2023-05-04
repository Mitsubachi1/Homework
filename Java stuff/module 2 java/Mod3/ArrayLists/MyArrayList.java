package ArrayLists;

import java.util.NoSuchElementException;

// Complete the implementation of your MyArrayList class in this file


public class MyArrayList implements MyList {
    // Implement the required fields and methods here
    private int capacity = 8;
    private int size = 0;
    private Object[] storage = new Object[capacity];

    @Override
    public void addToEnd(Object o) {
        if(size == capacity){
            makeCapacity(capacity*2);
        }
        storage[size] = o;
        size++;
    }

    @Override
    public void insertAt(int index, Object o) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException();
        }
        if (size == capacity) {
            makeCapacity(capacity * 2);
        }
        for (int i = size - 1; i >= index; i--) {
            storage[i + 1] = storage[i];
        }
        storage[index] = o;
        size++;
    }

    public void removeAt(int index){
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        for (int i = index; i < size - 1; i++) {
            storage[i] = storage[i + 1];
        }
        size--;
        if (capacity > 8 && size < capacity / 2) {
            makeCapacity(capacity / 2);
        }
        

    }
    public Object getAt(int index){
        if (index < 0 || index >= size){throw new NoSuchElementException();}
        return storage[index];
    }

    @Override
    public int getSize() {
       return size;
    }      
    //additional methods
    public void makeCapacity(int minCapacity){
        if(minCapacity < size || minCapacity < capacity){
            //take no action
        }
        else{
            capacity = minCapacity;
            Object[] newarr = new Object[capacity];
            int i = 0;
            for(Object element : storage){
                newarr[i] = element;
                i++;
                size++;
            }
            storage = newarr; // switch old array with new
        }

    }
    public void trimExcess(){
        makeCapacity(size);

    }
   
    // Do not alter the code below 
    @Override
    public MyListIterator getIterator() {
        return new MyArrayListIterator();
    }
    
    private class MyArrayListIterator implements MyListIterator {
        int currentIndex = -1;

        @Override
        public Object next() {
            ++currentIndex;
            return storage[currentIndex];
        }

        @Override
        public boolean hasNext() {
            return currentIndex < size - 1;
        }
    }

 
}