import java.util.*;

public class ArrayOfObjects {

  public static void main(String[] args) {
    Circle[] objs = new Circle[10];
    objs[1] = new Circle(10);

    System.out.println(objs[1].getArea());
  }

  static class Circle {
    public double radius;

    public Circle(double radius) {
      this.radius = radius;
    }

    public double getArea() {
      return Math.PI * radius * radius;
    }
  }
}
