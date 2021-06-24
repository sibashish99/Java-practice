class maxArea{
    
    static int calculate_Area(Rectangle arr[]){
        
        // Your code here
        int max=Integer.MIN_VALUE;
        
        for(int i=0;i<arr.length;i++){
            max=Math.max(max,arr[i].area());
        }
        return max;
        
    }
    
}
