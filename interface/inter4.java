interface bicycle{
    void applyBreak(int dec);
    void speedUp(int inc);
}
class cycle implements bicycle{

    public void applyBreak(int dec){
        int speed=10;
        System.out.println("Speed "+(speed-dec));
    }
    public void speedUp(int inc){
        int speed=10;
        System.out.println("Speed "+(speed+inc));
    }
}
class inter4{
    public static void main(String[] args){
        cycle c1=new cycle();
        c1.applyBreak(5);
        c1.speedUp(2);
    }
}