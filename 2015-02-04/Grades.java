public class Grades {
  public static void main(String[] args) {
    double[][][] grades = new double[3][3][2];

    for (int i = 0; i < grades.length; i++) {
      for (int j = 0; j < grades[i].length; j++) {
        for (int k = 0; k < grades[i][j].length; k++) {
          grades[i][j][k] = Math.random() * 100;
        }
      }
    }

    System.out.print("Student Name\t");
    for (int i = 0; i < grades[0].length; i++) {
      System.out.print("Exam " + (i + 1) + "\t");
    }
    System.out.println("Total");

    for (int i = 0; i < grades.length; i++) {
      double sum = 0;
      System.out.print("Student " + (i + 1) + "\t");
      for (int j = 0; j < grades[i].length; j++) {
        double avg = (grades[i][j][0] + grades[i][j][1]) / 2;
        sum += avg;
        System.out.print(String.format("%.2f", avg) + "\t");
      }
      System.out.println(String.format("%.2f", sum));
    }

  }
}
