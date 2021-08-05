import java.util.*;

class reverseStack{
    static Stack<Character> s = new Stack<>();
    static void insertBottom(char c){
        if(s.isEmpty()){
            s.push(c);
        }
        else{
            char a=s.peek();
            s.pop();
            insertBottom(c);

            s.push(a);
        }
    }
    static void reverse(){
        if(s.size()>0){
            char x=s.peek();
            s.pop();
            reverse();

            insertBottom(x);
        }
    }
    public static void main(String args[]){
        s.push('1');
        s.push('2');
        s.push('3');
        s.push('4');
        s.push('5');

        System.out.println("Original stack ");
        System.out.println(s);

        System.out.println("Reverse Starck");
        reverse();
        System.out.println(s);

    }
}