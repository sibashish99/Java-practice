import java,utill.*;
class gfg{
    static int countOccur(int n,int d){
      int count=0;
      while(n>0){
          count = (n%10==d)?count+1:count;
          n=n/10;
      }
      return count;
    }
    public static void main(String[] args){
        int d,n;
        Scanner sc= new Scanner(System.int);
        n= sc.nextInt();
        d= sc.nextInt();

        int val=countOccur(n,d);
        System.out.println(val);
    }
}