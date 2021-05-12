class Solution
{
    public static boolean find3Numbers(int a[], int n, int X) {    // n^2
    
    Arrays.sort(a);
    
    for(int i=0;i<n-2;i++){
        int j=i+1;
        int k=n-1;
        while(j<k){
            if(a[i]+a[j]+a[k]==X)
               return true;
            else if(a[i]+a[j]+a[k]<X)
                j++;
            else
                k--;
        }
      }
      return false;
    }
}

class Solution
{
    public static boolean find3Numbers(int a[], int n, int X) {    // n^3
    
      int flag=0;
      for(int i=0;i<n-2;i++){
          for(int j=i+1;j<n-1;j++){
              for(int k=j+1;k<n;k++){
                  if(a[i]+a[j]+a[k]==X){
                      flag=1;
                  }
              }
          }  
      }
      if(flag==1)
            return true;
        else
            return false;

    }
}










