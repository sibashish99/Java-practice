class Solution
{
    
    long minNum(long a[], int n)
    {
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=a[i];
        }
        if(sum%2==0)
          return 2;
        else
          return 1;
        
    }
}
