// javac fileName.java & java fileName
import java.util.*;
public class arraylist8{
    public static void main(String[] args) {
       System.out.println("How many nos:");
       Scanner sc = new Scanner(System.in);
       int n=sc.nextInt();

       ArrayList<Integer> list = new ArrayList<Integer>(n); //declaration
       System.out.println("add l1:");
       for(int i=0;i<n;i++){
           int x=sc.nextInt(); //take i/p
           list.add(x);
       }
       
       for(int i=0;i<list.size();i++){    //itterating using for 
           System.out.println(list.get(i)+" ");
       }
      
      System.out.println(list.contains(5)); //return true

      

    }
 }