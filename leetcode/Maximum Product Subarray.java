

class Solution {
    public int findDuplicate(int[] nums) {
        int[] result=new int[nums.length]; 
        for(int val:nums){
          result[val]++;
        }
        for(int i=0;i<result.length;i++){
          if(result[i]>1){
            return i;
          }    
        }
        return -1;
  }
}