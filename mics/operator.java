public class operator {
    public static void main(String arg[]){
        boolean a= true;
        if(a){
            System.out.println("is true");
        }
        else{
            System.out.println("is false");
        }

        int b=8;

        if(b%2==0 && b%4==0){
            System.out.println("8 is good!");
        }
        else{
            System.out.println("is not good");
        }
        int b1=8;

        if(b1%3==0 || b1%5==0){
            System.out.println("8 is good!");
        }
        else{
            System.out.println("is not good");
        }
        int b2=8;

        if(b2%2==0 ^ b2%4==0){
            System.out.println("8 is good!");
        }
        else{
            System.out.println("is not good");
        }
        int k=10;
        int i= (k%2==0)?k:0;
        System.out.println("is  "+i);
        int c=15;
        int d=10;
        int e= (c>d)?c:d;
        System.out.println("greater is "+e);

        int p=10;
        int q=15;
        System.out.println(+(p|q));
        System.out.println(+(p&q));
        System.out.println(+(p^q));
        System.out.println(+(~p));

    }
}