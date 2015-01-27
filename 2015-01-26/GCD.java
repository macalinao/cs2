public class GCD {
    public static void main(String[] args) {
        System.out.println(gcd(2, 4) + " == " + 2);
        System.out.println(gcd(5, 15) + " == " + 5);
        System.out.println(gcd(15, 35) + " == " + 5);
    }
    
    public static int gcd(int a, int b) {
        return (b == 0) ? a : gcd(b, a % b);
    }
}