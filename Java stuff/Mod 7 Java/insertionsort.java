public class insertionsort {
    public static void insertionSort(int [] numbers ){
        int i, j, temp;
        
        for ( i = 1; i < numbers.length; ++i ) {
        
        j=i;
        // I nsert numb er s3 i nto sorted part
        // stop i ng once numb ers3 in correcc osition
        while (j > 0 && numbers[j] < numbers[j - 1] ) {
        

        temp= numbers [j];
        numbers [j] = numbers [ j - 1];
        numbers [ j - 1] = temp;
         --j ;
}
System.out.println(numbers[3]);
    }
}

public static void main(String[] args) {
    int[] numbers = {91,47,54,11,24,66};
    insertionSort(numbers);
}



}