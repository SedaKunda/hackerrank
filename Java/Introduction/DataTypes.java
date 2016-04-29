/*
Given an input integer, you must determine which primitive data types are capable of properly storing that input.

Input Format

The first line contains an integer, TT, denoting the number of test cases. 
Each test case, TT, is comprised of a single line with an integer, nn, which can be arbitrarily large or small.

Output Format

For each input variable nn and appropriate primitive dataTypedataType, you must determine if the given primitives are capable of storing it. If yes, then print:

n can be fitted in:
* dataType
If there is more than one appropriate data type, print each one on its own line and order them by size (i.e.: byte<short<int<longbyte<short<int<long).

If the number cannot be stored in one of the four aforementioned primitives, print the line:

n can't be fitted anywhere.
*/

import java.util.*;
import java.io.*;



class DataTypes{
    public static void main(String []argh)
    {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();

        for(int i=0;i<t;i++)
        {
            try
            {
                long x=sc.nextLong();
                System.out.println(x+" can be fitted in: ");
                if(x>=-128 && x<=127) {System.out.println("* byte");}
                if(x>=Short.MIN_VALUE && x<=Short.MAX_VALUE){System.out.println("* short");}
                if(x>=Integer.MIN_VALUE && x<=Integer.MAX_VALUE){System.out.println("* int");}
                if(x>=Long.MIN_VALUE && x<=Long.MAX_VALUE){System.out.println("* long");}
            }
            catch(Exception e)
            {
                System.out.println(sc.next()+" can't be fitted anywhere.");
            }

        }
    }
}
