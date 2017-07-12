package com.hackerrank.amazon;

/* IMPORTANT: Multiple classes and nested static classes are supported */

/*
 * uncomment this if you want to read input.
//imports for BufferedReader
import java.io.BufferedReader;
import java.io.InputStreamReader;
*/
//import for Scanner and other utility  classes
import java.util.*;


public class TheMaximumSubarray {
    public static void main(String args[] ) {
        /*
         * Read input from stdin and provide input before running
         * Use either of these methods for input
*/

        Scanner s = new Scanner(System.in);
        int T = Integer.parseInt(s.nextLine());
        int N = Integer.parseInt(s.nextLine());
        int arr[] = new int[N];

        for(int i=0; i<N; i++){
            arr[i] = Integer.parseInt(s.nextLine());
        }
        System.out.println(maxSubArraySum(arr));
    }
    
    private static int maxSubArraySum(int a[])
    {
        int size = a.length;
        int maxCurrent = Integer.MIN_VALUE, maxFinal = 0;
 
        for (int i = 0; i < size; i++)
        {
        	maxFinal = maxFinal + a[i];
            if (maxCurrent < maxFinal)
            	maxCurrent = maxFinal;
            if (maxFinal < 0)
            	maxFinal = 0;
        }
        return maxCurrent;
    }
    
    private static int maxSubArraySum1(int a[], int size)
    {
    	int maxCurrent = a[0];
	    int finalMax = a[0];
	 
	    for (int i = 1; i < size; i++)
	    {
	    	finalMax = Math.max(a[i], finalMax+a[i]);
	    	maxCurrent = Math.max(maxCurrent, finalMax);
	    }
	    return maxCurrent;
    }
    
    private int maxSubArraySum2(int a[], int size)
    {
       int maxCurrent = 0, finalMax = 0;
       for (int i = 0; i < size; i++)
       {
    	   finalMax = finalMax + a[i];
           if (finalMax < 0)
        	   finalMax = 0;
           else if (maxCurrent < finalMax)
        	   maxCurrent = finalMax;
       }
       return maxCurrent;
    }
    
}
