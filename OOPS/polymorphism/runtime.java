/**
 method invocation is determined by the JVM not compiler,
it is known as runtime polymorphism.
 */
class Bank{
    float getRateOfInterest(){
        return 0;
    }
}
class SBI extends Bank{
    float getRateOfInterest(){
        return 5.1f;
    }
}
class ICICI extends Bank{
    float getRateOfInterest(){
        return 4.9f;
    }
}
class AXIS extends Bank{
    float getRateOfInterest(){
        return 5.3f;
    }
}
class runtime{
    public static void main(String[] args){
         Bank b1 ;
         b1= new SBI();
         System.out.println("SBI Rate Of Interest: "+b1.getRateOfInterest());
         b1= new ICICI();
         System.out.println("ICICI Rate Of Interest: "+b1.getRateOfInterest());
         b1= new AXIS();
         System.out.println("AXIS Rate Of Interest: "+b1.getRateOfInterest());

    }
}