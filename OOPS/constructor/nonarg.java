//If a constructor does not accept any parameters, it is known as a no-argument constructor.

class nonarg{
    int i;
     // constructor with no parameter
    private void noarg(){
        i=10;
        System.out.println("Constrictor in called!");
    }
    public static void main(String[] args){
        nonarg m = new nonarg();
        System.out.println("Main in called! i: "+m.i);

    }
}