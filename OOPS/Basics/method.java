import java.util.*;

class method{
    public static int isPrime(int value){
        int flag=0;
        for(int i=2; i<value/2; i++){
            if(value%i==0){
              flag=1;
            }
        }
        if(flag==1){
            return 0;
        }
        else{
            return 1;
        }
    }
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       int n= sc.nextInt();

       for(int i=1;i<=n;i++){
           if(isPrime(i)==0){
               System.out.print(i+" ");
           }
       }
    }
}