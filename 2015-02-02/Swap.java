public class Swap {
  public static void swap(int[] arr) {
    int temp = arr[1];
    arr[1] = arr[0];
    arr[0] = temp;
  }

  public static void main(String[] args) {
    int a = 5;
    int b = 6;
    int[] t = new int[]{a, b};
    swap(t);
    System.out.println(a + " " + b);
    System.out.println("== SWAP ==");
    System.out.println(t[0] + " " + t[1]);
  }
}
