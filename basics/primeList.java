import java.util.Scanner;

public class primeList{
    public static void main(String[] args) {
      
        Scanner one=new Scanner(System.in);
       
        System.out.println("Enter lower number:");
        int a=one.nextInt();
        
        System.out.println("Enter higher number:");
        int b=one.nextInt();
        
        for(int j=a;j<=b;j++) {
            boolean flag = false;
            for(int i = 2; i <=j/2; ++i) {
                if(j % i == 0) {
                    flag = true;
                    break;
                }
            }
        
            if (!flag && j != 0 && j!= 1)
                System.out.print(j+ " ");
        
            
        }
        
       

    }
}