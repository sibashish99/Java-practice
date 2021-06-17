//2d array
import java.util.Scanner;
public class array3{
	public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
		int[][] array= new int[n][m];  

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.println(i+"th row"+j+"th column");
                array[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(array[i][j]+" ");
                
            }
            System.out.println();
        }
		

	}
}
