import java.util.*;

public class TV {
  static int instances = 0;

  static final TV FULL_HD = new TV(1920, 1080);
  static final TV FOURK = new TV(3840, 2160);

  int channel = 1;
  int volume = 10;
  int xRes;
  int yRes;

  public TV() {
    this(1280, 720);
  }

  public TV(int xRes, int yRes) {
    this.xRes = xRes;
    this.yRes = yRes;
    instances++;
  }

  public int pixelCount() {
    return xRes * yRes;
  }

  public String aspectRatio() {
    int gcd = gcd(xRes, yRes);
    return (xRes / gcd) + ":" + (yRes / gcd);
  }

  public static int gcd(int a, int b) {
    return (b == 0) ? a : gcd(b, a % b);
  }

  public static void main(String[] args) {
    System.out.println("A full HD TV has " + FULL_HD.pixelCount() + " pixels and an aspect ratio of " + FULL_HD.aspectRatio() + ".");
    System.out.println("A 4K TV has " + FOURK.pixelCount() + " pixels and an aspect ratio of " + FOURK.aspectRatio() + ".");
    System.out.println("There are " + instances + " instances of TVs floating around.");
  }
}
