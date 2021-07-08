class MyThreadRunnable1 implements Runnable{
   public void run(){
       System.out.println("I am a thread");
   }
}
class MyThreadRunnable2 implements Runnable{
    public void run(){
        System.out.println("I am not a thread");
    }
 }
class the2{
    public static void main(String[] args){
      MyThreadRunnable1 myThread1 = new MyThreadRunnable1();
      Thread t1=new Thread(myThread1);

      MyThreadRunnable2 myThread2 = new MyThreadRunnable2();
      Thread t2=new Thread(myThread2);

      t1.start();
      t2.start();
    }
}