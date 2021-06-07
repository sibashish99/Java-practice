class Solution
{
    int columnWithMaxZeros(int arr[][], int n){
        // code here 
        int res=-1;
        int count=0;
        for(int i=0;i<n;i++){
            int val=0;
            for(int j=0;j<n;j++){
                if(arr[j][i]==0){
                    val++;
                }
            }
            if(val>count){
                res=i;
                count=val;
            }
        }
        return res;
    }
}