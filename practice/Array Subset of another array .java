class Compute {
    public String isSubset( long a1[], long a2[], long n, long m) {
        HashMap<Long,Integer> hmap= new HashMap<>();
        if(m>n){
            return "NO";
        }
        for(int i=0;i<n;i++){
            if(hmap.containsKey(a1[i])){
                int value=hmap.get(a1[i]);
                hmap.put(a1[i],value+1);
            }
            else{
                hmap.put(a1[i],1);
            }
        }
        for(int i=0;i<m;i++){
            if(!hmap.containsKey(a2[i])){
                return "No"; 
            }
        }
        return "Yes";
    }
}