/**
 Geek wants to make a special space for candies on his bookshelf. Currently, it has N books of different heights and unit width. Help him select 2 books such that he can store maximum candies between them by removing all the other books from between the selected books. The task is to find out the area between 2 books that can hold the maximum candies without changing the original position of selected books. 

Example 1:

Input: N = 3, height[] = {1, 3, 4}
Output: 1
Explanation:
1. Area between book of height 1 and book of 
height 3 is 0 as there is no space between 
them.
2. Area between book of height 1 and book of 
height 4 is 1 by removing book of height 3.
3. Area between book of height 3 and book of 
height 4 is 0 as there is no space between them.

 */

class Solution 
{ 
	static int maxCandy(int h[], int n) 
	{ 
	    // Your code goes here
	   if(n<=2){
	       return 0;
	   }
	   int l=0;
	   int r=n-1;
	   int cur=0;
	   int len=0;
	   int maxcan=Integer.MIN_VALUE;
	   int diff=0;
	   while(l<r){
	       len=r-l-1;
	       diff=Math.min(h[l],h[r]);
	       cur=diff*len;
	       
	       if(cur>=maxcan){
	           maxcan=cur;
	       }
	       if(h[l]<=h[r]){
	           l++;
	       }
	       else{
	           r--;
	       }
	   }
	   return maxcan;
	}
}