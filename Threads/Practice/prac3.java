/**
 Demonstrate gerPriority() and setPriority() methods in Java threads.
 */

class myThread5 extends Thread{
    public void run(){
        System.out.println("Hi i am thread");
    }
}
class myThread6 extends Thread{
   public void run(){
       System.out.println("Hi i am Sibashish");
   }
}
class prac3{
    public static void main(String[] args){
       myThread5 t1 = new myThread5();
       myThread6 t2 = new myThread6();
       t1.run();
       t2.run();

       t1.setPriority(5);
       t2.setPriority(1);

        System.out.println(t1.getPriority());
        System.out.println(t2.getPriority());
    }
}