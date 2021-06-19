// javac fileName.java & java fileName
import java.util.*;
public class arraylist6{
    public static void main(String[] args) {
       System.out.println("How many nos:");
       Scanner sc = new Scanner(System.in);
       int n=sc.nextInt();

       ArrayList<Integer> list = new ArrayList<Integer>(); //declaration
       ArrayList<Integer> list1 = new ArrayList<Integer>( n);
       System.out.println("add l1:");
       for(int i=0;i<n;i++){
           int x=sc.nextInt(); //take i/p
           list.add(x);
       }
       System.out.println("add l2:");
       for(int i=0;i<n;i++){
           int x=sc.nextInt(); //take i/p
           list1.add(x);
       } 
       list.addAll(0,list1);
       for(int i=0;i<list.size();i++){    //itterating using for 
           System.out.print(list.get(i)+" ");
       }
      
    

    }
 }