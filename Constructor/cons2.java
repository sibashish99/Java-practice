import java.io.*;
class Geek{
    String name;
    int age;

    Geek(String name,int age){
        this.name = name;
        this.age = age;
    }
}
class cons2{
    public static void main(String[] args){
        Geek g1=new Geek("Sibashish",21);

        System.out.println("Name "+g1.name+" Age "+g1.age);

    }
}


// class cons2{  
//     int id;  
//     String name;  
    
//     Student4(int i,String n){  
//     id = i;  
//     name = n;  
//     }  
    
//     void display(){
//         System.out.println(id+" "+name);
//     }  
   
//     public static void main(String args[]){  
   
//       Student4 s1 = new Student4(111,"Karan");  
//       Student4 s2 = new Student4(222,"Aryan");  
   
//       s1.display();  
//       s2.display();  
//    }  
// }  