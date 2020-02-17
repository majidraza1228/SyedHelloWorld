// Java program to print
// sierpinski triangle.
import java.util.*;
import java.io.*;

class GFG
{
    static void printSierpinski(int n)
    {
        for (int y = n - 1; y >= 0; y--) {

            // printing space till
            // the value of y
            for (int i = 0; i < y; i++) {
                System.out.print(" ");
            }

            // printing '*'
            for (int x = 0; x + y < n; x++) {

                // printing '*' at the appropriate
                // position is done by the and
                // value of x and y wherever value
                // is 0 we have printed '*'
                if ((x & y) != 0)
                    System.out.print(" "
                            + " ");
                else
                    System.out.print("* ");
            }

            System.out.print("\n");
        }
    }

    // Driver code
    public static void main(String args[])
    {
        int n = 16;

        // Function calling
        printSierpinski(n);
    }
}

// This code is contributed by Sahil_Bansall

