import java.util.ArrayList;

public class countlessavg {
    public static ArrayList<Integer> lessThanAverage(ArrayList<Integer> array) {
      ArrayList<Integer> newarr = new ArrayList<>();
      int sum = 0;
      double average = 0;
      for (int num : array){
        sum += num;
      }  
      average = (double)sum / (double)array.size(); // was lazy, just switch int sum to double to get same result

      for(int num : array){
        if (num < average){
            newarr.add(num);
        }
      }
      return newarr;
    }
}
