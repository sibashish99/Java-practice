class  Mythread1 extends Thread{
    public Mythread1(String name){
        super(name);
    }
    public void run(){
        System.out.println("I am thread "+this.getName());
    }
}
class the6{
    public static void main(String[] args){
       Mythread1 t1=new Mythread1("Sibashish");
       Mythread1 t2=new Mythread1("Sibashish Biswas (most Imporant)");
       Mythread1 t3=new Mythread1("Siba");
       Mythread1 t4=new Mythread1("Shivam");

       t2.setPriority(Thread.MAX_PRIORITY);
       t1.setPriority(Thread.MIN_PRIORITY);
       t2.setPriority(Thread.MIN_PRIORITY);
       t3.setPriority(Thread.MIN_PRIORITY);
  
       t1.start();
       t2.start();
       t3.start();
       t4.start();
    }
}