public class Range {
    public static int range(int[] arr){
        int max = arr[0], min = arr[0];
        for(int i = 0; i < arr.length; i++){
                if(arr[i] > max){ max = arr[i];}
                if(arr[i] < min){ min = arr[i];}
            
        }
        return max - min;  
    }
}
