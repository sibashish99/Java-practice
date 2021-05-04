class Geeks{
    static int findVal(int[] arr,int a,int n, int sum){
        if(a==n){
            if(sum%2==0)
              return  1;
            return 0;
        }
        return findVal(arr,a+1,n,sum+arr[a])+findVal(arr,a+1,n,sum);
    } 
    static int countSumSubsets(int arr[],int n)
    {
        
        //Your code here
        int sum=0;
        int ans=findVal(arr,0,n,sum);
         
        return ans-1;
    }
}