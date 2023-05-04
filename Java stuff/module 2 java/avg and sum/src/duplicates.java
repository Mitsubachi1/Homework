import java.util.ArrayList;

public class duplicates{
    public static ArrayList<Integer> allDuplicates(ArrayList<Integer> array){
        ArrayList<Integer> duplicates = new ArrayList<>();
        for (int i = 0; i < array.size(); i++){
            for(int j = 0; j < array.size(); j++){
                if ( i != j && array.get(i) == array.get(j) && !duplicates.contains(array.get(i))){
                    duplicates.add(array.get(i));
                    
                }
            }
        }
        return duplicates;
    }

















}