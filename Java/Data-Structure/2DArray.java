/*
In this problem you have to print the largest sum among all the hourglasses in the array.

Input Format
There will be exactly  lines, each containing  integers seperated by spaces. Each integer will be between -9 and 9 inclusive.

Output Format
Print the answer to this problem on a single line.
*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class 2DArray {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[][] = new int[6][6];
        for(int i=0; i < 6; i++){
            for(int j=0; j < 6; j++){
                arr[i][j] = in.nextInt();
            }
        }
      int test = -100;
      for (int a = 0; a < 4; a++) {
    	  for (int b = 0; b < 4; b++) {
    		  int count = 0;
    		  count += arr[a][b] + arr[a][b+1] + arr[a][b+2] + arr[a+1][b+1] + arr[a+2][b]
    				  + arr[a+2][b+1] + arr[a+2][b+2];
    	  if (count > test) {
    		  test = count;
    	  }
    	  }
      }
      System.out.println(test);
    }
}
