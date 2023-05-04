package IA;

public class Main {
    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList();
       

        list.addToEnd(1);
        list.addToEnd(2);
        list.addToEnd(3);
        list.removeAt(0);
        System.out.print(list.getAt(0));
    }
 }