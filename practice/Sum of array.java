class Solution {
    
    public long getSum(long a[], long n)
    {
        long sum=0;
        // Your code goes here
        for(int i=0;i<n;i++){
            sum+=a[i];
        }
        return sum;
    }
}