class Solution{
    static ArrayList<Integer> sieveOfEratosthenes(int N){
        // code here
        boolean prime[]=new boolean[N+1];
        Arrays.fill(prime,true);
        ArrayList<Integer>arr =new ArrayList<Integer>();
        
        for(int i=2;i*i<=N;i++){
            if(prime[i]==true){
                for(int j=i*i;j<=N;j+=i){
                    prime[j]=false;
                }
            }
        }
        for(int i=2;i<=N;i++){
            if(prime[i])
              arr.add(i);
        }
        
        return arr;
    }
}