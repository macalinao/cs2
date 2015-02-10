import java.util.*;

public class LinearSearch {
  public static void main(String[] args) {
    int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
    System.out.println(find(arr, 11) + " should be " + 10);
  }

  public static int find(int[] arr, int val) {
    int comps = 0;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == val) return i;
      System.out.println(++comps);
    }
    return -1;
  }
}
