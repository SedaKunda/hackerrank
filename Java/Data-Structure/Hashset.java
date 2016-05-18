/*
You are given n pairs of strings. Two pairs (a,b) and (c,d) are identical if a=c and b=d. That also implies (a,b) is not same as (b,a). After taking each pair as input, you need to print number of unique pairs you currently have.

Note: Brute force solution will not earn full points.

*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Hashset {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner s = new Scanner(System.in);
int sum = s.nextInt();
        s.nextLine();
HashSet hs = new HashSet();
for (int i=0;i <sum;i++) {
 hs.add(s.nextLine());
System.out.println(hs.size ());
}
    }
}
