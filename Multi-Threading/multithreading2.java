
class multithreading2 extends Thread {
     public void run(){
         for (int i = 0; i <5; i++) {
             try{
                 Thread.sleep(1000);
             }
             catch(InterruptedException e){
                 System.out.println("Interrupted Exception "+e);
             }
             System.out.println(i);
         }
     }
     public static void main(String[] args){
         multithreading2 mt1 = new multithreading2();
         multithreading2 mt2 = new multithreading2();
         mt1.start();
         mt2.start();
    }
}