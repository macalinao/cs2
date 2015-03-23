public class BS {
    public static void main(String[] args) {
      System.out.println(bs(new int[]{1, 2, 3, 4, 5, 6, 7, 8}, 8));
    }

    static int bs(int[] arr, int s) {
        return bs(arr, s, 0, arr.length - 1);
    }

    static int bs(int[] arr, int s, int lo, int hi) {
        int i = (hi + lo) / 2;
        int m = arr[i];
        if (s == m) {
            return i;
        }
        if (hi - lo == 0) return -1;
        if (s < m) {
            return bs(arr, s, lo, i - 1);
        }
        return bs(arr, s, i + 1, hi);
    }
}
