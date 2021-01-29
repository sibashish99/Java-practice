import java.util.Scanner;

public class prime{
    public static void main(String[] args) {
      
        Scanner one=new Scanner(System.in);
       
        System.out.println("Enter a number:");
        int a=one.nextInt();
        
        boolean isPrime=true;
 
        for(int i=2;i<=a/2;i++){
            if(a%i==0){
                isPrime=false;
            }
        }
        if(!isPrime){
            System.out.println(a+" is not prime no.");
        }
        else{
          System.out.println(a+" is prime no.");
        }
        
       

    }
}