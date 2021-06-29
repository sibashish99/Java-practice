
import java.util.*;;
public class meth1{
    static void logicSwap(int a,int b){
       int temp=a;
       a=b;
       b=temp;
        
    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("Before a "+a+" b "+b);
        logicSwap(a,b);

        System.out.println("After a "+a+" b "+b);
	}
}
