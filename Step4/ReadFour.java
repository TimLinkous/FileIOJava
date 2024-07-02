package Step4;

import java.util.Scanner;
import java.io.File;
import java.io.IOException;

public class ReadFour
{
    /**
     * Yes, you can look at the other 
     * examples in this lab to build your solution here.
     */
        public static void main(String[] args)
        {
            try {
                Scanner fileIn = new Scanner(new File("Step4/input.txt"));
                int total = 0;
                while (fileIn.hasNext()){

                    String lineIn = fileIn.nextLine();
                    String[] input = lineIn.split("\n");

                    for (int i = 0; i< input.length; i++) {
                        total += Integer.parseInt(input[i]);
                    }
                    System.out.println(total);
                }
            }catch (IOException e){
                System.out.println("File not found");
            }
            // Print out a running total of all the
            // values in the input file.
        }
}