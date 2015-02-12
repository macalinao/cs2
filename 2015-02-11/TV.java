import java.util.*;

public class TV {
  int channel;
  int volume;
  int xRes;
  int yRes;

  public TV() {
    channel = 1;
    volume = 10;
    xRes = 1280;
    yRes = 720;
  }

  public int pixelCount() {
    return xRes * yRes;
  }
}
