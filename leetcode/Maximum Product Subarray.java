class Solution {
    public int maxProduct(int[] nums) {
        var len = nums.length;
        if (len == 0) return 0;
        var max = nums[0];
        var left = 0;
        var right = 0;
        
        for (var i=0; i<len; i++) {
            left = (left == 0 ? 1 : left) * nums[i];
            right = (right == 0 ? 1 : right) * nums[len-1-i];
            max = Math.max(max, Math.max(left, right));
        }
        
        return max;
    }
}
