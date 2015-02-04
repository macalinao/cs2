import java.util.*;

public class M {
  public static void main(String[] args) {
    int num = 2;
    int[] myArray = { 3, 4, 5, 6, 7, 8, 9, 1293, 2193, 3 };
    m(num, myArray);
    System.out.println(num);
    printArray(myArray);
    System.out.println("reverse time");
    reverse(myArray);
    printArray(myArray);
  }

  public static void reverse(int[] arr) {
    for (int i = 0; i < arr.length / 2; i++) {
      int t = arr[arr.length - i - 1];
      arr[arr.length - i - 1] = arr[i];
      arr[i] = t;
    }
  }

  public static void printArray(int[] array) {
    String p = "";
    for (int i = 0; i < array.length; i++) {
      p += array[i] + " ";
    }
    System.out.println(p.trim());
  }

  public static void m(int n, int[] array) {
    n = 5;
    array[0] = 10;
  }
}
