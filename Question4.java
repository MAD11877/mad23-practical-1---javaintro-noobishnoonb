import java.util.Scanner;

public class Question4 {
  public static void main(String[] args) {
    /**
     * Prints a right angle triangle with *. The base of the triangle depends on the
     * integer given.
     * e.g.
     * > 5
     * *****
     * ****
     * ***
     * **
     * *
     * 
     * Hint: 2 loops are required. System.out.print(...) to print on single line.
     */

    Scanner in = new Scanner(System.in);
    int linesNo = in.nextInt();
    in.close();

    int i = 0;

    while (i < linesNo) {

      int y = 0;

      while (y < linesNo--) {
        System.out.print("*");
      }

      i += 1;
    }
  }
}
