// javac fileName.java & java fileName
import java.util.*;
public class arraylist5{
    public static void main(String[] args) {
       System.out.println("How many nos:");
       Scanner sc = new Scanner(System.in);
       int n=sc.nextInt();

       ArrayList<Integer> list = new ArrayList<Integer>(n); //declaration
        
       System.out.println("add:");
       for(int i=0;i<n;i++){
           int x=sc.nextInt(); //take i/p
           list.add(x);
       }
       for(int i=0;i<list.size();i++){    //itterating using for 
           System.out.print(list.get(i)+" ");
       }
       System.out.println();
       for(int num:list){
          System.out.print(num+" ");
       }

    }
 }