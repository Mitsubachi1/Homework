public class MyMergeSorts {

    public static void mergesort(IList<Integer> list) {
        IList<Integer> sorted = mergesortHelper(list);
        for (int i = 0; i < list.size(); i++) {
            list.set(i, sorted.get(i));
        }
    }
    
    private static IList<Integer> mergesortHelper(IList<Integer> list) {
        if (list.size() <= 1) {
            return list;
        }
        IList<Integer> left = getLeftHalf(list);
        IList<Integer> right = getRightHalf(list);
        IList<Integer> sortLeft = mergesortHelper(left);
        IList<Integer> sortRight = mergesortHelper(right);
        return merge(sortLeft, sortRight);
    }
    
    private static IList<Integer> getLeftHalf(IList<Integer> list) {
        int size = list.size() / 2;
        IList<Integer> left = new MyArrayList<Integer>();
        for (int i = 0; i < size; i++) {
            left.add(list.get(i));
        }
        return left;
    }
    
    private static IList<Integer> getRightHalf(IList<Integer> list) {
        int size = list.size() - (list.size() / 2);
        IList<Integer> right = new MyArrayList<Integer>();
        for (int i = 0; i < size; i++) {
            right.add(list.get(i + list.size() / 2));
        }
        return right;
    }
    
    private static IList<Integer> merge(IList<Integer> list, IList<Integer> list2) {
        int index1 = 0;
        int index2 = 0;
        IList<Integer> merged = new MyArrayList<Integer>();
        while (index1 < list.size() && index2 < list2.size()) {
            if (list.get(index1) <= list2.get(index2)) {
                merged.add(list.get(index1));
                index1++;
            } else {
                merged.add(list2.get(index2));
                index2++;
            }
        }
        while (index1 < list.size()) {
            merged.add(list.get(index1));
            index1++;
        }
        while (index2 < list2.size()) {
            merged.add(list2.get(index2));
            index2++;
        }
        return merged;
    }
}