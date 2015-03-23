public class Euclid {
  public static void main(String[] args) {
    System.out.println(euclid(4, 2));
  }

  static int euclid(int m, int n) {
    m = Math.abs(m);
    n = Math.abs(n);
    if (m % n == 0) return n;
    return euclid(n, m % n);
  }
}
