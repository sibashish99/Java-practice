class abstraction1{
    public static void main(String[] args){
        Bank sbi = new SBI();
        Bank icici = new ICICI();
        System.out.println("SBI: "+sbi.getInterest());
        System.out.println("ICICI: "+icici.getInterest());
    }
}
abstract class Bank{
    abstract int getInterest();
}
class SBI extends Bank{
    int getInterest(){
        return 5;
    }
}
class ICICI extends Bank{
    int getInterest(){
        return 10;
    }
}