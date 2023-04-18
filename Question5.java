import java.util.Scanner;
import java.util.ArrayList;

public class Question5
{
  public static void main(String[] args)
  {
    /**
     * Prompt the user for number. This input indicates the number of integers the user will be entering next. 
     * Print out the mode (highest occurrence) from the set of integers. 
     *    e.g.
     *     > 5
     *     > 2
     *     > 4
     *     > 1
     *     > 3
     *     > 4
     *     4
     * 
     *    e.g.
     *     > 4
     *     > 2
     *     > 2
     *     > 3
     *     > 3
     *     2
     * Hint: Use a loop to get input. Use another 2 loops to find the mode
     */
     
    Scanner in = new Scanner(System.in);

    System.out.print("Enter the number of numbers to enter");
    int noOfnumbers = in.nextInt();

    int x = 0;

    ArrayList<Integer> data = new ArrayList<>();
    
    while (x < noOfnumbers) {

      System.out.print("Enter number: ");
      int number = in.nextInt();

      
      data.add(number);
    }

    int maxValue = 0;
    int maxCount = 0;

    for (int i = 0; i < data.length; ++i) {

      int count = 0;

      for (int k = 0; k < data.length; ++k) {

        if (data[i] == data [k]) {

          ++count;
        }

      }

      if (count > maxCount) {
        maxCount = count;
        maxValue = data[i];
      }
    }

    System.out.println(maxValue);
    
  }
}
