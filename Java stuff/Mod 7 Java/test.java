public class test{
public static void selectionSort(int [ ] numbers) {
   int i, j, temp;
   int indexSmallest;

   for (i = 0; i < numbers.length - 1; i++) {

      // Find index of smallest remaining element
      indexSmallest = i;
      for (j = i + 1; j < numbers.length; j++) {

         if (numbers[ j ] < numbers[ indexSmallest ]) {
            indexSmallest = j;
         }
      }

      // Swap numbers[ i ] and numbers[ indexSmallest ]
      temp = numbers[ i ];
      numbers[ i ] = numbers[ indexSmallest ];
      numbers[ indexSmallest ] = temp;
      System.out.println(numbers[4]);
   }
 }

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
System.out.println(numbers[1]);
}
}

public static int BinarySearch(int[] list, int targetValue) {
   int mid, low, high;
   low = 0;
   high = list.length - 1;
   while (high >= low) {
   mid = (high + low) / 2;
   System.out.println(list[mid]);
   if (list[mid] < targetValue) {
   low = mid + 1;
   } else if (list[mid] > targetValue) {
   high = mid - 1;
   } else {
   return mid;
   }
}
   return -1;
}

public static void main(String[] args) {
   int target = 7;

   int[ ] numbers = {85, 43, 61, 5, 18, 76};
    insertionSort(numbers);
}


}
