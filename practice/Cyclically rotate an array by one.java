class Compute {
    
    public void rotate(long arr[], long n)
    {
        long x = arr[(int)n - 1]; 
        for ( int i = (int)n - 1; i > 0; i--){
           arr[i] = arr[i - 1]; 
        } 
         arr[0] = x; 
    }
}