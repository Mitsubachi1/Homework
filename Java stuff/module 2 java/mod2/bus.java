import java.util.*;
public class bus{

private int street;
private int direction;
public bus(){

}
public void drive(){


}
public int getLocation(){



}
public static void main(String[] args){
    Scanner in = new Scanner(System.in);
    int numBlocks = in.nextInt();
    bus myBus = new bus();
    for(int i = 0; i < numBlocks; i++){
        myBus.drive();
    }
    System.out.println(myBus.getLocation());

}













}