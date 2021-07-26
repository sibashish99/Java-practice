import java.util.*;

class Stack{
    static final int MAX=1000;
    int top;
    int a[]= new int[MAX];

    boolean isEmpty(){
        return (top<0);
    }
    Stack(){
        top=-1;;
    }
    boolean push(int x){
        if(top>=(MAX-1)){
            System.out.println("Stack Overflow");
            return false;
        }
        else{
            a[++top]=x;
            System.out.println(x+" pushed in the stack");
            return true;
        }
    }
    int pop(){
        if(top<0){
            System.out.println("Stack Underflow");
            return 0;
        }
        else{
            int x= a[top--];
            return x;
        }
    }
    int peek(){
        if(top<0){
            System.out.println("Stack Underflow");
            return 0;
        }
        else{
            int x=a[top];
            return x;
        }
        
    }
}
class one{
    public static void main(String args[]){
        Stack st= new Stack();
        Scanner s= new Scanner(System.in);
        System.out.println("Enter the number of elements to be entered");
        int n= s.nextInt();
        for(int i=0;i<n;i++){
            int x= s.nextInt();
            st.push(x);
        }
        // System.out.println("The elements are");
        // while(!s.isEmpty()){
        //     System.out.println(s.pop());
        // }
        System.out.println(st.pop() +" Popped from Stack");
    }
}