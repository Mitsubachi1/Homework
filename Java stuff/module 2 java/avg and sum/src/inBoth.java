import java.util.ArrayList;
public class inBoth {
    public static ArrayList<Integer> allinBoth(ArrayList<Integer> array1, ArrayList<Integer> array2){
        ArrayList<Integer> duplicates = new ArrayList<>();
        for (int i = 0; i < array1.size(); i++){
            for(int j = 0; j < array2.size(); j++){
                if ((array1.get(i) == array2.get(j)) && !duplicates.contains(array1.get(i))){
                    duplicates.add(array1.get(i));
                    
                }
            }
        }
        return duplicates;
    }





}
