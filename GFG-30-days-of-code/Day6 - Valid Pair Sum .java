/**
 
 Given an array of size N, find the number of distinct pairs {a[i], a[j]} (i != j) in the array with their sum greater than 0.

Example 1:

Input: N = 3, a[] = {3, -2, 1}
Output: 2
Explanation: {3, -2}, {3, 1} are two 
possible pairs.

 */

class Solution 
{ 
    static long ValidPair(int a[], int n) 
	{ 
	    // Your code goes here
	     int front=0;
	     int end=n-1;
	     long count=0;
	     Arrays.sort(a);
	     
	     while(end>front){
	         if(a[front]+a[end]>0){
	             count+=end-front;
	             end--;
	         }
	         else 
	            front++;
	     }
	     return count;
	}
} 