import java.io.*;
class Geek{
    Geek(String name){
        System.out.println("name "+name);
    }
    Geek(String name,int age){
        System.out.println("name "+name+" Age "+age);
    }
    Geek(long num){
        System.out.println("number "+num);
    }
}
class cons3{
    public static void main(String[] args){
        Geek g1=new Geek("Sibashish");
        Geek g2=new Geek("Sibashish",21);
        Geek g3= new Geek(62212456);
    }
}