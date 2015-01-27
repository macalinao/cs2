public class Hex2Dec {
  public static void main(String[] args) {
    System.out.println(hex2dec("face"));
  }

  public static String hex2dec(String hex) {
    char[] arr = hex.toCharArray();
    int num = 0;
    for (int i = 0; i < arr.length; i++) {
      char c = Character.toUpperCase(arr[arr.length - i - 1]);
      int val = (int) c;
      if (val > 9) {
        val = c - ((int) 'A') + 1 + 9;
      }
      num = num | (val << i * 4);
    }
    return Integer.toString(num);
  }
}
