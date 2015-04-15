import java.util.*;

public class HeapSort {
  public static void main(String[] args) {
    int[] arr = { 1, 5, 2, 9, 3, 8, 3, 6, 8, 7, 5, 4, 2, 6};
    heapsort(arr);
    System.out.println(Arrays.toString(arr));
  }

  public static void heapsort(int[] arr) {
    PriorityQueue<Integer> heap = new PriorityQueue<>();
    for (int i : arr) {
      heap.add(i);
    }
    for (int i = 0; i < arr.length; i++) {
      arr[i] = heap.poll();
    }
  }
}
