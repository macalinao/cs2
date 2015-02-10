import java.util.*;

public class BinarySearch {
  public static void main(String[] args) {
    int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
    System.out.println(find(arr, 2) + " should be " + 1);
  }

  public static int find(int[] arr, int val) {
    int comps = 0;

    int lo = 0;
    int hi = arr.length - 1;
    for (;;) {
      if (hi == lo) return -1;
      int mid = (lo + hi) / 2;
      int v = arr[mid];
      comps++;
      System.out.println(comps);
      if (val == v) {
        return mid;
      } else if (val > v) {
        lo = mid;
      } else if (val < v) {
        hi = mid;
      }
    }
  }
}
