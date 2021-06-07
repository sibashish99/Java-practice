class GfG{
    int maxLen(int arr[], int n){
        // Your code here
   
        int maxLength = 0, prefixSum = 0;
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            prefixSum += arr[i];
            if (prefixSum == 0)
                maxLength = i + 1;
            Integer index = map.get(prefixSum);
            if (index == null)
                map.put(prefixSum, i);
            else
                maxLength = Math.max(maxLength, i - index);
        }
        return maxLength;
    }
}