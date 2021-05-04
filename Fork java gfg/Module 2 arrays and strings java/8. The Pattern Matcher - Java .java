class Geeks{
    
    static void follPatt(String s)
    {
        
        //Your code here
        int l=s.length();
        int count=0;
        for(int i=0;i<l;i++){
            if(s.charAt(i)=='x'){
                count++;
            }
            else{
                count--;
            }
            if(count<0) 
              break;
        }
        if(count==0){
          System.out.print(1);  
        }
        else{
            System.out.print(0);
        }
        System.out.println();
    }
}