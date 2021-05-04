class Geeks{
    
    static void countOddEven(int a[], int n){
        
        // Your code here
        int even=0,odd=0;
        for(int i=0;i<n;i++){
            if(a[i]%2==0){
                even++;
            }
            else{
                odd++;
            }
        }
        System.out.println(odd+" "+even);
    }
}