//Given a string without spaces, the task is to remove duplicates from it.
/**
 
Example 1:

Input: S = "zvvo"
Output: "zvo"
Explanation: Only keep the first
occurrence
Example 2:

Input: S = "gfg"
Output: gf
Explanation: Only keep the first
occurrence
 */

class Solution {
      
    static String removeDups(String str){
       /*StringBuilder sb = new StringBuilder();  //correct solution
        for(int i=0;i<str.length();i++){
            if(sb.toString().indexOf(str.charAt(i))==-1){
                sb.append(str.charAt(i));
             }
        }
        return sb.toString();*/
         
         char[] a=str.toCharArray();
         Set<Character> s=new LinkedHashSet<Character>();
         for(char c:a){
             s.add(c);
         }
         StringBuilder sb = new StringBuilder(); 
         for(Character b: s){
             sb.append(b);
         }
         return sb.toString();
         
         
        
    }
}