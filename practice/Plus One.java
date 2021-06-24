/**
Given a non-negative number represented as a list of digits, add 1 to the number (increment the number represented by the digits). The digits are stored such that the most significant digit is first element of array.
 
Example 1:

Input: 
N = 3
arr[] = {1, 2, 4}
Output: 
1 2 5
Explanation:
124+1 = 125, and so the Output
 */


class Solution {
    static ArrayList<Integer> increment(ArrayList<Integer> a , int n) {
        // code here
        int i = n-1;
       if( a.get(i) < 9){
         a.set( i, a.get(i)+1);
         return a;
        }
       else{
         a.set(i, 0);
         if( i == 0){
           a.add( 0, 1);
           return a;
          }
         increment(a, n-1);
        }
       return a;
    }
};