/*
Problem URL: - https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/

This problem can be easily solved using Two Pointer Algorithm. You just have to apply
the basic Two Pointer Algorithm and you are good to go. You don't even need to change any single
value.
 */

public class TwoSum {

    static int[] twoSum(int[] numbers, int target) {

        int start = 0;
        int end = numbers.length - 1;
        int result[] = new int[2];

        while(start < end){


            int sum = numbers[start] + numbers[end];


            if(sum == target){
                result[0] = start + 1;
                result[1] = end + 1;
                break;

            }else if(sum > target){
                end--;

            }else if(sum < target){
                start++;
            }
        }

        return result;




    }

}
