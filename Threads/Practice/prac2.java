/*
 Add a step method in the welcome thread 
 of question 1 to delay its execution for 200ms.
 */

class myThread3 extends Thread{
    public void run(){
        try{
            Thread.sleep(200);
        }
        catch(Exception e){
            e.printStackTrace();
        }
        System.out.println("Wlcome");
    }
}
class myThread4 extends Thread{
   public void run(){
       System.out.println("GM");
   }
}
class prac2{
    public static void main(String[] args){
       myThread3 t1 = new myThread3();
       myThread4 t2 = new myThread4();
       t1.run();
       t2.run();
    }
}