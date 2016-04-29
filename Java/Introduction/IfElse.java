/*
Given an integer NN as input, check the following:

If NN is odd, print "Weird".
If NN is even and, in between the range of 2 and 5(inclusive), print "Not Weird".
If NN is even and, in between the range of 6 and 20(inclusive), print "Weird".
If NN is even and N>20N>20, print "Not Weird".
We given you partially completed code in the editor, complete it to solve the problem.

Input Format
There is a single line of input: integer NN.

Constraints
1≤N≤1001≤N≤100

Output Format
Print "Weird" if the number is weird. Otherwise, print "Not Weird". Do not print the quotation marks.
*/

    import java.io.*;
    import java.util.*;
    import java.text.*;
    import java.math.*;
    import java.util.regex.*;

    public class IfElse {

        public static void main(String[] args) {

            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();            
            String ans="";
            if(n%2==1){
              ans = "Weird";
            }
            else{            
               if (n>=2 && n<=5) {
            		ans = "Not Weird";
            	}
            	if (n>=6 && n<=20) {
            		ans = "Weird";
            	}
            	if (n>20) {
            		ans = "Not Weird";
            	}                
            }
            System.out.println(ans);
            
        }
    }
