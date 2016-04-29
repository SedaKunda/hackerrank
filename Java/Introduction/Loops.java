/*
In this problem you will test your knowledge of Java loops. Given three integers aa, bb, and nn, output the following series:

a+20b,a+20b+21b,......,a+20b+21b+...+2n−1ba+20b,a+20b+21b,......,a+20b+21b+...+2n−1b

Input Format
The first line will contain the number of testcases t. Each of the next tt lines will have three integers, aa, bb, and nn.

Constraints:
0≤t≤5000≤t≤500
0≤a,b≤500≤a,b≤50
1≤n≤151≤n≤15

Output Format
Print the answer to each test case in separate lines.

Sample Input
2
0 2 10
5 3 5
Sample Output
2 6 14 30 62 126 254 510 1022 2046
8 14 26 50 98
*/

import java.io.*;
import java.util.*;

public class Loops {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
        	int a = sc.nextInt();
        	int b = sc.nextInt();
        	int n = sc.nextInt();
        		for (int j = 0; j < n; j++) {
        			a += (int) Math.pow(2, j)*b;
        			System.out.print(a +" ");
        		}
        	System.out.println();
        }
    }
}
