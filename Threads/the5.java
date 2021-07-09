class  Mythread extends Thread{
    public Mythread(String name){
        super(name);
    }
    public void run(){
        System.out.println("I am thread");
    }
}
class the5{
    public static void main(String[] args){
       Mythread t1=new Mythread("Sibashish");
       t1.start();
       System.out.println("Id is "+t1.getId());
       System.out.println("Id is "+t1.getName());
    }
}