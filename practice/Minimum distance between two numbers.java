class Solution {
    int minDist(int a[], int n, int x, int y) {
        // code here
       
       int i=-1;
       int j=-1;
       int ans=Integer.MAX_VALUE;
       int min= Integer.MIN_VALUE;
       
       for(int k=0;k<n;k++){
           if(a[k]==x){
               i=k;
           }
           if(a[k]==y){
               j=k;
           }
           if(i!=-1 && j!=-1)
               ans=Math.min(ans, Math.abs(i-j));
       }
       if(ans==Integer.MAX_VALUE)
          return -1;
        else
          return ans;
       
    }
}