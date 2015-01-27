public class Palindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome("madamimadam") + " == " + true);
        System.out.println(isPalindrome("f;asljf") + " == " + false);
        System.out.println(isPalindrome("apple") + " == " + false);
    }
    
    public static boolean isPalindrome(String s) {
        for (int i = 0; i < s.length() / 2; i++) {
            if (s.charAt(i) != s.charAt(s.length() - i - 1)) {
                return false;
            }
        }
        return true;
    }
}