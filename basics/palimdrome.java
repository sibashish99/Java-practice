import java.util.Scanner;

public class palimdrome{
    public static void main(String[] args) {
       Scanner one=new Scanner(System.in);
       
       System.out.println("Enter two numbers:");
       int a=one.nextInt();
       int rev=0,rem;
       int temp=a;

       while(a!=0){
           rem=a%10;
           rev=rev*10 +rem;
           a=a/10;
           
       }
       if(temp==rev)
         System.out.println(temp+" is a palimdrome number");
        else
        System.out.println(temp+" is not a palimdrome number");
    
       

    }
}