import java.util.*;

public class BinarySearch {
  public static void main(String[] args) {
    int[] arr = BinarySearch.makeArray(100000000);
    long time = System.currentTimeMillis();
    System.out.println(find(arr, 901001001) + " should be 901001001");
    System.out.println("Elapsed ms: " + (System.currentTimeMillis() - time));
  }

  public static int[] makeArray(int size) {
    int[] arr = new int[size];
    for (int i = 0; i < arr.length; i++) {
      arr[i] = i;
    }
    return arr;
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
      // System.out.println(comps);
      if (val == v) {
        return mid;
      } else if (val > v) {
        lo = mid + 1;
      } else if (val < v) {
        hi = mid - 1;
      }
    }
  }
}
