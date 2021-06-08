//Monk and the Magical Candy Bags hackerearth

import java.util.*;
class TestClass {
public static void main(String args[] ) throws Exception {

   Scanner sc=new Scanner(System.in);
   int t=sc.nextInt();
 
   for(int k=1;k<=t;k++){
     int n=sc.nextInt();
     int time=sc.nextInt();
     long sum=0;

     PriorityQueue<Long> pq = new PriorityQueue<Long>(Collections.reverseOrder());

     for(int i=0;i<n;i++){
       pq.add(sc.nextLong());
     }
     for(int j=1;j<=time;j++){
       long a=pq.poll();
       sum=sum+a;
       pq.add(a/2);
     }
     System.out.println(sum);

    }

 }

}


