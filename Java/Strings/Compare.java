/*
Given a string, find out the lexicographically smallest and largest substring of length k.

[Note: Lexicographic order is also known as alphabetic order dictionary order. So "ball" is smaller than "cat", "dog" is smaller than "dorm". Capital letter always comes before smaller letter, so "Happy" is smaller than "happy" and "Zoo" is smaller than "ball".]

Input Format
First line will consist a string containing english alphabets which has at most 1000 characters. 2nd line will consist an integer k.

Output Format
In the first line print the lexicographically minimum substring. In the second line print the lexicographically maximum substring.
*/

import java.io.*;
import java.util.*;

public class Compare {

    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
        String A=sc.next();
        int B=sc.nextInt();
        ArrayList<String> ar = new ArrayList<String>();
        for (int i = 0; i <= A.length()-B; i++) {
        	String a = A.substring(i, i+B);
        	ar.add(a);         	        	
        }
        ar.sort(null);
        System.out.println(ar.get(0));
        System.out.println(ar.get(ar.size()-1));
    }
}
