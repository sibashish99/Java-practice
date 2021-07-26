// Implementing Stack using Linked List:


public class StackAsLinkedList{
    StackNode root;

    static class StackNode{
        int data;
        StackNode next;
        StackNode(int data){
            this.data = data;
        }
    }
     public boolean isEmpty() {
         if(root==null){
             return true;
         }
         else{
             return false;
         }
     }

    public void push(int data) {
        StackNode newNode = new StackNode(data);
        if(root==null){
            root = newNode;
        }
        else{
            StackNode temp = root;
            root= newNode;
            newNode.next=temp;
        }
        System.out.println(data+ " pushed to stack");
    }
    public int pop(){
        int pop = Integer.MIN_VALUE;
        if(root==null){
            System.out.println("Stack is empty");
        }
        else{
            pop=root.data;
            root=root.next;
        }
        return pop;
    }
    public int peek(){
        if(root==null){
            System.out.println("Stack is empty");
            return Integer.MIN_VALUE;
        }
        else{
            return root.data;
        }
    }


  public static void main(String[] args){
    StackAsLinkedList sl= new StackAsLinkedList();
    sl.push(10);
    sl.push(20);
    sl.push(30);
    System.out.println(sl.pop()+" Pooped from stack");
    System.out.println("Top element is: "+ sl.peek());
  }
}