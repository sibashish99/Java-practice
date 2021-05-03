class Geeks{
    static void bitWiseOp(int a, int b, int c){
        
        // Your code here
        int  d = a ^ a;
        int e = c ^ b ;
        int f = a & b;
        int g = c | (a ^ a) ;
        int h = ~(c^b);
        System.out.println(d+"\n"+e+"\n"+f+"\n"+g+"\n"+h);
        
    }
}