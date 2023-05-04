public class MaxandMin {
    public static int[] maxAndMin(int[] arr){
        int[] result = new int[2];
        int max = arr[0], min = arr[0];
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
            if(arr[i]< min){
                min = arr[i];
            }
        }
        //set results to new array
        result[0] = max;
        result[1] = min;
        return result;
    }
}
