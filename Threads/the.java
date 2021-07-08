class MyThread1 extends Thread{
    @Override
    public void run(){
        int i=0;
        while(i<10){
            System.out.println("My thread1 is runnng");
            i++;
        }
    }
}
class MyThread2 extends Thread{
    @Override
    public void run(){
        int i=0; // 
        while(i<10){
            System.out.println("My thread2 is runnng");
            i++;
        }
    }
}

class the{
    public static void main(String[] args){
          MyThread1 T1=new MyThread1();
          MyThread2 T2=new MyThread2();

          T1.start();
          T2.start();
      }
}