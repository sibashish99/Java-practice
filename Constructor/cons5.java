class Complex{
    private double re,img;
    //constructor using fields
    public Complex(double re, double img){
       this.re = re;
       this.img = img;
    }
    Complex (Complex C){
        System.out.println("Copy constructor is called");
        re=c.re;
        img=c.img;
    }

    public String toStirng(){
        return "(" + re + " + " + img + "i)";
    }
} 

public class cons5{
    public static void main(String[] args){
        Complex c2 = new Complex(c1);                                                                                                                      
        Complex c3 = c2;  
 
        System.out.println(c2);
    }
}
