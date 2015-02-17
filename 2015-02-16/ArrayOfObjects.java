import java.util.*;

public class ArrayOfObjects {

  public static void main(String[] args) {
    Circle[] objs = new Circle[10];
    for (int i = 0; i < objs.length; i++) {
      objs[i] = new Circle(Math.random() * 10);
    }

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
