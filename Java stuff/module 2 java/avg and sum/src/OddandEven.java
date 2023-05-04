public class OddandEven {
    public static int[] oddAndEven(int[] arr){
        int[] result = new int[2];
        int even = 0, odd = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] < 0){
                arr[i] = -arr[i];
            }
            if (arr[i] %2 == 0){
                even++;
            }
            if (arr[i] % 2 == 1){
                odd++;
            }
            
        }
        result[0] = odd;
        result[1] = even;
        return result;
    }
}
