class Solution {
    int[] kLargest(int[] arr, int n, int k) {
        // code here
        ArrayList<Integer> a=new ArrayList<Integer>();
        Arrays.sort(arr);
        int[] res=new int[k];
        int i=0;
        int j=n-1;
        while(i<k){
            res[i]=arr[j];
            i=i+1;
            j=j-1;
        }
        
        return res;
    }
}