class  Mythread2 extends Thread{
    public Mythread2(String name){
        super(name);
    }
    public void run(){
        System.out.println("I am thread "+this.getName());
    }
}
class  MyNewthread2 extends Thread{
    public void run(){
        System.out.println("I am thread "+this.getName());
    }
}
class the7{
    public static void main(String[] args){
       Mythread2 t1= new Mythread2("Sibashish");
       t1.start();
       try{
           t1.join();
       }
       catch(Exception e){
           System.out.println(e);
       }
       Mythread2 t2= new Mythread2("Sibashish Biswas");
       t2.start();

    //    try {  //sleep()
    //     for (int i = 1; i <=5; i++) {
    //         Thread.sleep(2000);
    //         System.out.println(i);
    //     }
    // }
    // catch (Exception e) {
    //     System.out.println(e);
    // }
    }
}