class Geeks{
    
    static int columnWithMaxZero(int arr[][],int n){
        
        // Your code here
        int a=0,count=0;
        for(int i=0;i<n;i++){
            int b=0;
            for(int j=0;j<n;j++){
                if(arr[j][i]==0){
                    b++;
                }
            }
            if(b>a){
                a=b;
                count=i;
            }
        }
        return count;
        
    }
}