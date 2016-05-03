/*
Given a string AA, print "Yes" if it is a palindrome, print "No" otherwise. The strings will consist lower case english letters only. The strings will have at most 50 characters.

Some examples of palindromes are "madam", "anna", "reviver".
*/

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        Solution s = new Solution();
        if (s.reverse(A)) {
        	System.out.print("Yes");
        }
        else {
        	System.out.print("No");
        }
    }
    
    public boolean reverse(String n) {
    	boolean a = false;
    	String x = "";
    	for (int i = n.length()-1; i >= 0; i--) {
    		x=x.concat(""+n.charAt(i));
    	}
    	if (n.equals(x)) {
    		a = true;
    	}
    	return a;
    }
}
