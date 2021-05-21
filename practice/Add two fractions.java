class GfG
{ 	
    void addFraction(int num1, int den1, int num2, int den2)
    {
      
        long nmax;
        long lcm=den1*den2;
        for(int i=Math.max(den1,den2);i<=(den1*den2);i++){
            if(i%den1==0 && i%den2==0) {
                lcm=i;
                break;
            }
        }
        nmax=(num1*lcm/den1)+(num2*lcm/den2);
        
        for(long i=lcm-1;i>1;i--){
            if(nmax%i==0 && lcm%i==0){
                nmax/=i;
                lcm/=i;
            }
        }
        System.out.println(nmax+"/"+lcm);
    }
}