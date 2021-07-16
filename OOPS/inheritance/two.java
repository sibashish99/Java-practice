class Fruit{   Multilevel Inheritance Example
    void display(){
        System.out.println("Fruit class is called");    
    }
}
class Apple extends Fruit{
    void displayApple(){
        System.out.println("Apple class is called");
    }
}
class miniApple extends Apple{
    void displayMiniApple(){
        System.out.println("miniApple class is called");
    }
}
class two{
    public static void main(String[] args){
        miniApple m = new miniApple();
        m.display();
        m.displayApple();
        m.displayMiniApple();



    }
}