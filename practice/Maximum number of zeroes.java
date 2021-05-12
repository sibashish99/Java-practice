class Solution
{
    String MaxZero(String arr[], int N)
    {
        int max=0;
        String ans="-1";

      for(String i:arr){
         int cnt=0;
         for(char x:i.toCharArray()){
          int v= Integer.parseInt(String.valueOf(x));
          if(x=='0')
          cnt++;
         }
        
        if(cnt>max){
         max=cnt;
         ans=i;
        }
        else if(cnt==max && cnt!=0){
            if(ans.length()==i.length()) 
                ans=(ans.compareTo(i) <0)?i: ans;
            else 
                ans=ans.length()<i.length()?i:ans;
         }
      }
       return ans;
    }
}
