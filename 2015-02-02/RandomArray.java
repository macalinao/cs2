import java.util.*;

public class RandomArray {
  public static double[] randomize(double[] arr) {
    for (int i = 0; i < arr.length; i++) {
      arr[i] = Math.random() * 100;
    }
    return arr;
  }

  public static double sum(double[] arr) {
    double sum = 0;
    for (int i = 0; i < arr.length; i++) {
      sum += arr[i];
    }
    return sum;
  }

  public static double max(double[] arr) {
    double max = arr[0];
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] > max) max = arr[i];
    }
    return max;
  }

  public static void main(String[] args) {
    double[] arr = new double[100];
    randomize(arr);

    System.out.println("Sum: " + sum(arr));
    System.out.println("Max: " + max(arr));
  }
}
