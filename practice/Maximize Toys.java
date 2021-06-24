class Solution{
    static int toyCount(int N, int K, int arr[])
    {
        // code here
        Arrays.sort(arr);
        int sum = 0;
        int count = 0;
        for(int i = 0; i < N; i++){
            
            if((arr[i] + sum) <= K)
            {
                sum += arr[i];
                count++;
            }
        
            else if(sum > K){
                break;
            }
        }
        
        return count;
    }
}