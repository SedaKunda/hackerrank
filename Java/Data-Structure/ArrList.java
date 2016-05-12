/*
Sometimes it's better to use dynamic size arrays. Java's Arraylist can provide you this feature. Try to solve this problem using Arraylist.
You are given nn lines. In each line there are zero or more integers. You need to answer a few queries where you need to tell the number located in ythyth position of xthxth line. 
Take your input from System.in.

Input Format
The first line has an integer nn. In each of the next nn lines there will be an integer dd denoting number of integers on that line and then there will be dd space-separated integers. In the next line there will be an integer qq denoting number of queries. Each query will consist of two integers xx and yy.

Output Format
In each line, output the number located in ythyth position of xthxth line. If there is no such position, just print "ERROR!"
*/

import java.util.*;

public class ArrList {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        ArrayList<Integer> a = new ArrayList<Integer>();
        ArrayList<Integer> b = new ArrayList<Integer>();
        for (int i = 0; i < t; i++) {
        	int x = s.nextInt();
        	a.add(x);
        	for (int j = 0; j < x; j++) {
        		b.add(s.nextInt());
        	}
        }
        int d = s.nextInt();
        ArrayList<Integer> e = new ArrayList<Integer>();
        for (int i = 0; i < d; i++) {
        	e.add(s.nextInt());
        	e.add(s.nextInt());
        }
        s.close();
        for (int y = 0; y < d+d; y=y+2) {
        	int pos = e.get(y+1);
        	int line = e.get(y);
        	int len = a.get(line-1);
        	int sum2 = 0;
        	if (line - 1 > 0) {
        		for (int u = 0; u < line-1; u++) {
        			sum2 += a.get(u);
        		}
        	}
        	if (len < pos) {
        		System.out.println("ERROR!");
        	}
        	else {
        		System.out.println (b.get(sum2 + (pos-1)));
        	}
        }
    }
}
