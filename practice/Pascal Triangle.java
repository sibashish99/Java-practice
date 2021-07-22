/*
Given a positive integer N, return the Nth row of pascal's triangle.
Pascal's triangle is a triangular array of the binomial coefficients formed by summing up the elements of previous row.

Example :
1
1 1
1 2 1
1 3 3 1
For N = 3, return 3rd row i.e 1 2 1
 */


class Solution {
   
    ArrayList<Long> nthRowOfPascalTriangle(int n) {
        // code here
          ArrayList<Long> a=new ArrayList<>();
          long arr[][]=new long[n][n];
          long m=1000000007;
          
          for(int i=0;i<n;i++){
             for(int j=0;j<=i;j++){
              if(j==0 || i==j){
                  arr[i][j]=1;
              }
              else{
                  arr[i][j]=(arr[i-1][j-1]%m + arr[i-1][j]%m)%m ;
              }
          }
         }
         for(int i=0;i<n;i++){
             a.add(arr[n-1][i]);
         }
         
         return a;
    }
}