class Solution {
     
    static int first(int arr[], int low, int high)
    {
        if (high >= low) {
            int mid = low + (high - low) / 2;
            if ((mid == 0 || (arr[mid - 1] == 0)) && arr[mid] == 1)
                return mid;
            else if (arr[mid] == 0)
                return first(arr, (mid + 1), high);
            else
                return first(arr, low, (mid - 1));
        }
        return -1;
    }
    int rowWithMax1s(int mat[][], int n, int m) {
        int max_row_index = 0, max = -1;
        int i, index;
        for (i = 0; i < m; i++) {
            index = first(mat[i], 0, n - 1);
            if (index != -1 && n - index > max) {
                max = n - index;
                max_row_index = i;
            }
        }
 
        return max_row_index;
    }
}