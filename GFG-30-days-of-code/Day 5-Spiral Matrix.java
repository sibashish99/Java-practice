/**

Given a matrix of size N x M. You have to find the Kth element which will obtain while traversing the matrix spirally starting from the top-left corner of the matrix.

Example 1:

Input: 
N = 3, M = 3, K = 4
A[] = {{1, 2, 3}, 
       {4, 5, 6}, 
       {7, 8, 9}}
Output: 
6

 */

 class Solution
{
   
	public int findK(int a[][], int n, int m, int k)
	{
	    // Your code goes here
	   int r=-1;
	   int count=0;
	   int r1=0;
	   int c1=0;
	   
	   while(r1<n && c1<m){
	       for(int i=c1;i<m;i++){
	           if(++count==k){
	               return a[r1][i];
	           }
	       }
	       r1++;
	       for(int i=r1;i<n;i++){
	           if(++count==k){
	               return a[i][m-1];
	           }
	       }
	       m--;
	       if(r1<n){
	           for(int i=m-1;i>=c1;i--){
	               if(++count==k){
	                   return a[n-1][i];
	               }
	           }
	           n--;
	       }
	       if(c1<m){
	           for(int i=n-1;i>=r1;i--){
	               if(++count==k){
	                   return a[i][c1];
	               }
	           }
	           c1++;
	       }
	   }
	   return r;
	}
	
}