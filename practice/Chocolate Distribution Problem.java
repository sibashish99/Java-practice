class Solution
{
    public long findMinDiff (ArrayList<Long> a, long n, long m)
    {
        // your code here
    Collections.sort(a);
    long  ans = Long.MAX_VALUE ;
    for (int i = 0; i+m-1 < n; i++) {
       long x=a.get((int)i);
       long y=a.get((int)(i+m-1));
       ans=Math.min(ans,y-x);
    }
    return ans;
    }
}