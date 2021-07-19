/**
 Given a string S consisting of uppercase and lowercase characters. The task is to sort uppercase and lowercase letters separately such that if the ith place in the original string had an Uppercase character then it should not have a lowercase character after being sorted and vice versa.

Example 1:

Input:
N = 12
S = defRTSersUXI
Output: deeIRSfrsTUX
Explanation: Sorted form of given string
with the same case of character as that
in original string is deeIRSfrsTUX
 */

class Solution
{
    //Function to perform case-specific sorting of strings.
    public static String caseSort(String str)
    {
        // Your code here
        Queue<Character> lower = new PriorityQueue<>();
        Queue<Character> upper = new PriorityQueue<>();
        
        for(int i = 0; i < str.length(); ++i) {
            
            if(Character.isLowerCase(str.charAt(i)))
                lower.add(str.charAt(i));
            else
                upper.add(str.charAt(i));
        }
        
        String ans = "";
        
        for(int i = 0; i < str.length(); ++i) {
            char c = str.charAt(i);
            
            if(Character.isLowerCase(c))
                ans += lower.remove();
            else
                ans += upper.remove();
        }
        
        return ans;
    }
}