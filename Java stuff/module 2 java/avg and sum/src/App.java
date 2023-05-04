public class App {
    public static void main(String args[]){
      
      
    }
    public static double[] avgAndSum(int[] arr){
        double avg = 0;
        double sum = 0;
        double[] results = new double[2];
        for(int i =0; i < arr.length; i++){
            sum += arr[i]; //add stuff
        }
        avg = sum/arr.length; //average it
        results[0] = avg;
        results[1] = sum;
        return results;
    }
}
