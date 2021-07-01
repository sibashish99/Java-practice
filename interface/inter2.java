interface langu{   //creating interface in interface keyword
  void getName(String name);
}
class Programming implements langu{
    public void getName(String name){    //implementing interface in  implements keyword
        System.out.println("Language is "+name);
    }
}
class inter2{
    public static void main(String[] args){
        Programming p1=new Programming();
        p1.getName("Java");
    }
}