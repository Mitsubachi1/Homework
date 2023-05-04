public class countGreaterthanAverage {
    public static int countGreaterThanAverage(int[] arr){
        int sum = 0, average = 0, count = 0;
        for(int num : arr){
            sum += num;
        }

        average = sum / arr.length;
        for (int num : arr){
            if (num > average){
                count++;
            }
        }
        return count;
    }
}
