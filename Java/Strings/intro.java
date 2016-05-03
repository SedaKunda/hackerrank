/*
Given two strings of lowercase English letters, AA and BB, perform the following operations:

Sum the lengths of AA and BB.
Determine if AA is lexicographically larger than BB (i.e.: does BB come before AA in the dictionary?).
Capitalize the first letter in AA and BB and print them on a single line, separated by a space.

Input Format
Two strings, the first being AA and the second being BB. They are comprised of lowercase English letters (no symbols or spaces) and may not be on the same line.

Output Format
There are three lines of output: 
For the first line, sum the lengths of AA and BB. 
For the second line, write Yes if AA is lexicographically larger than BB or No if it is not. 
For the third line, capitalize the first letter in both AA and BB and print them on a single line, separated by a space.
*/

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        System.out.println(A.length()+B.length());
        if(B.compareTo(A)<0) {
        	System.out.println("Yes");
        }
        else if(B.compareTo(A)>0) {
        	System.out.println("No");
        }
        else if(B.compareTo(A)==0) {
        	System.out.println("No");
        }
        String a = "" + A.charAt(0);
        String b = "" + B.charAt(0);
        System.out.println(a.toUpperCase() + A.substring(1) +" " + b.toUpperCase() + B.substring(1));
    }
}
