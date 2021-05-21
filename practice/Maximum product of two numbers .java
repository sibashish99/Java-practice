class Solution{
    public:
    
        int maxProduct(int arr[], int n) {
            // code here
            int max=0;
            int maxIndex;
            for(int i=0;i<n;i++){
                if(arr[i]>max){
                    max=arr[i];
                    maxIndex=i;
                }
            }
            int smax=0;
            for(int i=0;i<n;i++){
                if(maxIndex!=i && arr[i]>smax){
                    smax=arr[i];
                }
            }
            return (max*smax);
        }
    };
    