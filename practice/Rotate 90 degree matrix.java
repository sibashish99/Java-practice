class GFG
{
    static void rotate(int matrix[][]) 
    {
        // Code Here
        for(int i = 0; i < matrix.length; i++){
         for(int j = i; j < matrix.length; j++){
           int temp = matrix[i][j];
           matrix[i][j] = matrix[j][i];
           matrix[j][i] = temp;
           }
         }
         for(int i = 0; i < matrix.length; i++){
             int k = matrix.length-1;
             for(int j = 0; j < k; j++){
              int temp = matrix[j][i];
              matrix[j][i] = matrix[k][i];
              matrix[k][i] = temp; 
             k--;
             }
         }
    }
}