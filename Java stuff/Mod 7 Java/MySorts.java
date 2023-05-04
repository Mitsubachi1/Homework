public class MySorts {
   // implement your quicksort algorithm below
   
   public static void quicksort(IList<Integer> stuff){
        quicksortHelper(stuff, 0, stuff.size()-1);
   }
   private static void quicksortHelper(IList<Integer> stuff, int low, int high){
        if (low < high){
            int partindx = partition(stuff,low,high);
            quicksortHelper(stuff, low, partindx-1);
            quicksortHelper(stuff, partindx, high);
        }

   }
   private static int partition (IList<Integer> stuff, int low, int high){
    int pivot = stuff.get(high);
    int i = low - 1;
    for(int j = low; j <= high-1; j++){
        if(stuff.get(j) <= pivot){
            i++;
            swap (stuff,i,j);
        }
    }
        swap(stuff, i+1, high);
            return i+1;
    }
   
   private static void swap(IList<Integer> stuff, int i, int j){
        int tmp = stuff.get(i);
        stuff.set(i,stuff.get(j));
        stuff.set(j,tmp);
   }
}