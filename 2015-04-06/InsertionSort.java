import java.util.*;

public class InsertionSort {
  public static void main(String[] args) {
    int[] arr = {2, 3,1,6,2,7,3};
    for (int i = 0; i < arr.length - 1; i++) {
      for (int j = i + 1; j > 0 && arr[j] < arr[j - 1]; j--) {
        int temp = arr[j];
        arr[j] = arr[j - 1];
        arr[j - 1] = temp;
      }
    }
    System.out.println(Arrays.toString(arr));
  }
}
