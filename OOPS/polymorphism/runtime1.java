class Animals{
    void eat(){
        System.out.println("Eating.....");
    }
}
class Dogyy extends Animals{
    void eat(){
        System.out.println("Eating and Running.....");
    }
}
class babyDogyy extends Dogyy{
    void eat(){
        System.out.println("Eating and Running and Playing.....");
    }
}

class runtime1 {
    public static void main(String[] args) {
       Animals a1, a2, a3;
       a1= new Animals();
       a2= new Dogyy();
       a3= new babyDogyy();

       a1.eat();
       a2.eat();
       a3.eat();
       
    }
}