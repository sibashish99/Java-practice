class GfG{
    public static int num(int arr[], int n, int k){
           //Your code here
           int res=0;
           for(int i=0;i<n;i++){
               while(arr[i]>10){
                   int dig=arr[i]%10;
                   if(dig==k){
                     res++;
                   }
                   arr[i]/=10;
               }
               if(arr[i]==k){
                   res++;
               }
           }
           return res;
      }
}