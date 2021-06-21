import java.io.*;
class Geek{
    int num;
    String name;
    
    Geek(){
      System.out.println("Construtor is called");
    }
}
class cons1{
    public static void main(String[] args){
        Geek g= new Geek();
        System.out.println(g.name);
        System.out.println(g.num);

    }
}