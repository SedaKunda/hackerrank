/*
Input Format
Every line of input will contain a String followed by an integer. 
Each String will have a maximum of 1010 alphabetic characters, and each integer will be in the inclusive range from 00 to 999999.

Output Format
In each line of output there should be two columns: 
The first column contains the String and is left justified using exactly 1515 characters. 
The second column contains the integer, expressed in exactly 33 digits; if the original input has less than three digits, you must pad your output's leading digits with zeroes.

Sample Input
java 100
cpp 65
python 50

Sample Output
================================
java           100 
cpp            065 
python         050 
================================
*/
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("================================");
            for(int i=0;i<3;i++){
                String s1=sc.next();
                int x=sc.nextInt();
                System.out.printf("%-14s %03d\n", s1, x);
            }
            System.out.println("================================");

    }
}
