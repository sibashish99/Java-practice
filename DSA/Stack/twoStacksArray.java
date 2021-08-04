import java.util.*;

class twoStacks{
    int[] arr;
    int top1, top2;
    int size;

    twoStacks(int n){
        size=n;
        arr= new int[n];
        top1=n/2+1;
        top2=n/2;
    }

    // method to push element in stcak 1
    void push1(int x){
        if(top1>0){
            top1--;
            arr[top1]=x;
        }
        else{
            System.out.println("Stack Overflow");
            return;
        }
    }
    //method to push element in stcak 2
    void push2(int x){
        if(top2<size-1){
            top2++;
            arr[top2]=x;
        }
        else{
            System.out.println("Stack Overflow");
            return;
        }
    }

    //method to pop element from stack 1
    int pop1(){
        if(top1<= size/2){
            int x=arr[top1];
            top1++;
            return x;
        }
        else{
            System.out.println("Stack Underflow");
            System.exit(1);
        }
        return 0;
    }

    //method to pop element from stack 2
    int pop2(){
        if(top2>= size/2 +1){
            int x=arr[top2];
            top2--;
            return x;
        }
        else{
            System.out.println("Stack Underflow");
            System.exit(1);
        }
        return 1;
    }
};
class twoStacksArray{
    public static void main(String[] args){
        twoStacks ts=new twoStacks(5);
        ts.push1(5);
        ts.push2(3);
        ts.push2(15);
        ts.push1(110);


        System.out.println("Popped element from stack one is: "+ ts.pop1());
        ts.push2(40);
        System.out.println("Popped element from stack two is: "+ ts.pop2());
    }
}