class Solution {
    int sumOfMatrix(int N, int M, int[][] a) {
        int sum=0;
        // code here
        for(int i=0;i<N;i++){
            for(int j=0;j<M;j++){
                sum+=a[i][j];
            }
        }
        return sum;
    }
}