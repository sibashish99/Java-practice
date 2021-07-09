/*Write a program to print "Good morning" and "Welcome"  on the
 screen in Java using threads. */
 class myThread1 extends Thread{
     public void run(){
         System.out.println("Hi i am thread");
     }
 }
 class myThread2 extends Thread{
    public void run(){
        System.out.println("Hi i am Sibashish");
    }
}
 class prac1{
     public static void main(String[] args){
        myThread1 t1 = new myThread1();
        myThread2 t2 = new myThread2();
        t1.run();
        t2.run();
     }
 }