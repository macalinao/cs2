import java.util.*;

public class LinearSearch {
  public static void main(String[] args) {
    int[] arr = BinarySearch.makeArray(100000000);
    long time = System.currentTimeMillis();
    System.out.println(find(arr, 90190190) + " should be 90190189");
    System.out.println("Elapsed ms: " + (System.currentTimeMillis() - time));
  }

  public static int find(int[] arr, int val) {
    int comps = 0;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == val) return i;
      // System.out.println(++comps);
    }
    return -1;
  }
}
