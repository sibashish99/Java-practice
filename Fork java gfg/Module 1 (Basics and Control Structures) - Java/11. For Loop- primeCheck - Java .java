class Geeks {
    static void isPrime (int n) 
    {
           
               //Your code here
              if(n == 1){
                System.out.println("No");
                return;
               }
        
              boolean flag = false;
              for(int i=2;i<=Math.sqrt(n);i++){
                 if(n%i == 0){
                     flag = true;
                     break;
                   }
                }
       
              if(flag){
                 System.out.println("No");
              }
              else{
                 System.out.println("Yes");   
              }
             
    }

}