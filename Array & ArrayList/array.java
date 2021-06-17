// javac fileName.java & java fileName
import java.util.Scanner;
public class array {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt(); //array dec

        int[] array=new int[n];
        for(int i=0;i<n;i++){
            array[i]=sc.nextInt(); //array i/p
        }
        System.out.println("Array is: ");
        for(int i=0;i<n;i++){    //array o/p
            System.out.print(array[i]+" ");
        }
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=array[i];   //array sum
        }
        System.out.println("Array sum is: "+sum);
        int max=array[0];
        for(int i=1;i<n;i++){   //max value 
            if(array[i]>max){
                max=array[i];
            }
        }
        System.out.println("Array max is: "+max);

        int min=array[0];
        for(int i=1;i<n;i++){   //min value
            if(array[i]<min){
                min=array[i];
            }
        }
        System.out.println("Array min is: "+min);
        System.out.println("Array length is: "+array.length);  //array length
         
        String[] students={"abc","bcd","hwgy","jsysn"};  //string array 
        System.out.println("String length is: "+students.length);
        for(String element:students){   //for each loop 
            System.out.println(element);
        }
    }
 }