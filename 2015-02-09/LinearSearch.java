import java.util.*;

public class LinearSearch {
  public static void main(String[] args) {
    int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
    System.out.println(find(arr, 6) + " should be " + 5);
  }

  public static int find(int[] arr, int val) {
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == val) return i;
    }
    return -1;
  }
}
