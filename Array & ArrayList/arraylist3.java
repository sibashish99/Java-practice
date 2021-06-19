// javac fileName.java & java fileName
import java.util.*;
public class arraylist3 {
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
       System.out.println(list); //print list
       System.out.println("remove:");  //removing element
       list.remove(4);
       System.out.println(list);

    }
 }