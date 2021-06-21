class cons4{  
    int id;  
    String name;  
    int age;  
    cons4(int i,String n){  
      id = i;  
      name = n;  
    }   
    cons4(int i,String n,int a){  
      id = i;  
      name = n;  
      age=a;  
    }  
    void display(){
        System.out.println(id+" "+name+" "+age);
    }  
   
    public static void main(String args[]){  
      cons4 s1 = new cons4(111,"Karan");  
      cons4 s2 = new cons4(222,"Aryan",25);  
      s1.display();  
      s2.display();  
   }  
}  