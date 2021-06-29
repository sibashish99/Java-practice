
import java.util.*;;
public class meth{
    static int logic(int a,int b){
        if(a>b){
            return a*5;
        }
        else{
            return b*5;
        }
        
    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();

        System.out.println(logic(a,b));
	}
}
