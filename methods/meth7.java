class Complex{
  private double re,img;
  public Complex(double re,double img){   
      this.re = re;
      this.img = img;
  }
}
class meth7{
    public static void main(String[] args){
        Complex c1=new Complex(10,15);
        Complex c2=new Complex(10,15);  //Overriding equals method

        if(c1==c2){
            System.out.println("equal");
        }
        else{
            System.out.println("Not equal");
        }
    }
}