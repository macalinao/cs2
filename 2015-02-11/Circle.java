public class Circle {
  double radius;

  public Circle(double radius) {
    this.radius = radius;
  }

  public double area() {
    return Math.PI * radius * radius;
  }

  public static void main(String[] args) {
    Circle c = new Circle(10);
    System.out.println("The area of a circle of size " + 10 + " is " + c.area());
  }
}
