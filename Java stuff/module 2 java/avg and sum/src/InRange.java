import java.util.ArrayList;

public class InRange {
    public static ArrayList<Integer> inRange(ArrayList<Integer> array, int min, int max){
        ArrayList<Integer> newarray = new ArrayList<>();
        for (int num : array ){
            if(min <= num && num <= max){
                newarray.add(num);
            }
        }
        return newarray;
    }
}
