/*
Given a square matrix, calculate the absolute difference between the sums of its diagonals.
For example, the square matrix  is shown below:
1 2 3
4 5 6
9 8 9
 */

import java.util.Scanner;
import java.util.*;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class HACRDiagonalDiff {

    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        int n ;
        int diag1 = 0 ; int diag2 = 0;
        n = Integer.parseInt(in.nextLine());
        for(int i =0 ; i < n; i++){
            String str[] = in.nextLine().split(" ");
            diag1 = diag1 + Integer.parseInt(str[i]);
            diag2 = diag2 + Integer.parseInt(str[n-1-i]);
        }

        int diagDiff = Math.abs(diag1 -  diag2);
        System.out.println(diagDiff);
    }

}
