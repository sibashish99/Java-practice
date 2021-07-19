/**
 118. Pascal's Triangle
Easy

3070

146

Add to List

Share
Given an integer numRows, return the first numRows of Pascal's triangle.

In Pascal's triangle, each number is the sum of the two numbers directly above it as shown:


 

Example 1:

Input: numRows = 5
Output: [[1],[1,1],[1,2,1],[1,3,3,1],[1,4,6,4,1]]
Example 2:

Input: numRows = 1
Output: [[1]]
 */

class Solution {
    public List<List<Integer>> generate(int numRows) {
         List <List<Integer>> res= new ArrayList();
        if(numRows==0){
           return res;
        }
        res.add(new ArrayList<>());
        res.get(0).add(1);
        for(int i=1;i<numRows;i++){
           List<Integer> curr= new ArrayList<>();
           curr.add(1);
           for(int j=1;j<i;j++){
             curr.add(res.get(i-1).get(j-1) + res.get(i-1).get(j));
           }
            curr.add(1);
            res.add(curr);
        }
        return res;
    }
}
