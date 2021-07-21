import java.io.*;  
class Parent{  
  void msg()throws Exception{System.out.println("parent");}  
}  
  
class exceptionHandling7 extends Parent{  
  void msg(){System.out.println("child");}  
  
  public static void main(String args[]){  
   Parent p=new exceptionHandling7();  
   try{  
   p.msg();  
   }catch(Exception e){}  
  }  
}  