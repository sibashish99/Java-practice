/**
 In Geekland there is a grid of coins of size N x N. You have to find the maximum sum of coins in any sub-grid of size K x K.
Note: Coins of the negative denomination are also possible at Geekland.

Example 1:

Input: N = 5, K = 3 
mat[[]] = {1, 1, 1, 1, 1} 
          {2, 2, 2, 2, 2} 
          {3, 8, 6, 7, 3} 
          {4, 4, 4, 4, 4} 
          {5, 5, 5, 5, 5}
Output: 48
Explanation: {8, 6, 7}
             {4, 4, 4}
             {5, 5, 5}
has the maximum sum

 */

class Solution
{
    public int Maximum_Sum(int mat[][],int N,int K){
        // Your code goes here
        int res[][]= new int[N][N];
        int sum=0;
        
        for(int j=0;j<N;j++){
            sum=0;
            
            for(int i=0;i<K;i++){
                sum+=mat[i][j];
            }
            res[0][j] = sum;
            
            for(int i=1;i<N-K+1;i++){
                sum+=(mat[i+K-1][j] - mat[i-1][j]);
                res[i][j]=sum;
            }
        }
        int max= Integer.MIN_VALUE;
        for(int i=0;i<N-K+1;i++){
            sum=0;
            for(int j=0;j<K;j++){
                sum+=res[i][j];
            }
            if(sum>max){
                max=sum;
            }
            for(int j=1;j<N-K+1;j++){
                sum+=(res[i][j+K-1] - res[i][j-1]);
                if(sum>max){
                    max=sum;
                }
            }
        }
        
        return max;
    }
}
