/*
This problem will test your knowledge on java array. 
You are given an array of nn integers. A sub-array is "Negative" if sum of all the integers in that sub-array is negative. Count the number of "Negative sub-arrays" in the input array.

Note: Subarrays are contiguous chunks of the main array. For example if the array is {1,2,3,5} then some of the subarrays are {1}, {1,2,3}, {2,3,5}, {1,2,3,5} etc. But {1,2,5} is not an subarray as it is not contiguous.
*/

import java.math.BigDecimal;
import java.util.*;

class 1DArray{

    public static void main(String []argh)
    {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int []s=new int[n];
        int count = 0;
        for(int i=0;i<n;i++) {
            s[i] = sc.nextInt();
        }
        
        for (int i = 0; i < n; i++) {
        	int sum = 0;
        	for (int j = i; j < n; j++) {
            	sum+=s[j];
            	if (sum<0) {
            		count++;
            	}
            }
        }
        System.out.println (count);
    }


}
