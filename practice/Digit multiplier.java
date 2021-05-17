class Solution {
    static String getSmallest(Long n) {
        // code here
        String ans="";
        while(n>9){
            boolean flag=false;
            for(int i=9;i>1;i--){
                if(n%i==0){
                    ans=i+ans;
                    n/=i;
                    flag=true;
                    break;
                }
            }
            if(!flag) 
              return "-1";
        }
        ans=ans+n;
        return ans;
        
    }
};