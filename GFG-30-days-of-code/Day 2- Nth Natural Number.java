class Solution {
    long findNth(long N)
    {
        //code here
        long ans=0;
        long mul=1;
        while(N!=0){
           long dig=N%9;
           N=N/9;
           ans+=(mul*dig);
           mul=mul*10;
        }
        return ans;
    }
}