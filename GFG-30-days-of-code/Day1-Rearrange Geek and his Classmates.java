class Solution 
{ 
    void prank(long[] a, int n)  
    { 
        // code here
        long[] b= new long[n];
        for(int i=0;i<n;i++){
            int temp=(int)a[i];
            b[i]=a[temp];
        }
        
        for(int i=0;i<n;i++){
            a[i]=b[i];
        }
    }
} 