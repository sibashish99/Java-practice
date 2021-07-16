class Language{   //Polymorphism using method overriding
    public void displayInfo(){
        System.out.println("programming language...");
    }
}
class Java extends Language{
    @Override
    public void displayInfo(){
        System.out.println("java programming language...");
    }
}


class overriding{
    public static void main(String[] args){
       Java j1=new Java();
       j1.displayInfo();

       Language j2=new Language();
       j2.displayInfo();
    }
}