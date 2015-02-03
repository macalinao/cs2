import java.util.*;

public class RandomArray {
  public static void main(String[] args) {
    double[] myList = new double[100];
    for (int i = 0; i < myList.length; i++) {
      myList[i] = Math.random() * 100;
    }

    double sum = 0;
    double max = myList[0];
    for (int i = 0; i < myList.length; i++) {
      if (myList[i] > max) max = myList[i];
      sum += myList[i];
    }
    System.out.println("Sum: " + sum);
    System.out.println("Max: " + max);
  }
}
