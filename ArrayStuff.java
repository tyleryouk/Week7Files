public class ArrayStuff {
  
  /**
   * Insert an element into a sorted array
   * @param list the list
   * @param n the number of elements in the list, and the list is at least n+1 in length
   * @param k the element to add
   */
  public static <T extends Comparable<? super T>> void insert(T[] list, int n, T k) {
     int index;
     for (index = n; index > 0 && k.compareTo(list[index - 1]) < 0; index--)
       list[index] = list[index - 1];
     list[index] = k;
  }
  
}