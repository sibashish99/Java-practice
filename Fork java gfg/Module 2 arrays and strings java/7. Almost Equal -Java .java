class Geeks{
    
    static int coutChars(String s1, String s2)
    {
        
       //Your code here
       int[] chars=new int[26];
       
       for(char c1: s1.toCharArray()){
           chars[c1-97]++;
       }
       for(char c2:s2.toCharArray()){
           chars[c2-97]--;
       }
        
        int count=0;
        for(int i: chars){
            count+=Math.abs(i);
        }
        
        return count;
       
    }
}