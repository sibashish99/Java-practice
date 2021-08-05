public class midStack {
    class DLLNode{
        DLLNode prev;
        int data;
        DLLNode next;
        DLLNode(int d){
            data=d;
        }
    }

    class myStack{
        DLLNode top;
        DLLNode bottom;
        int cnt;
    }

    myStack createStack(){
        myStack ms=new myStack();
        ms.cnt=0;
        return ms;
    }
   void push(myStack ms,int new_data){
        DLLNode new_node=new DLLNode(new_data);
        new_DDLNode.prev=null;
        new_DDLNode.next=ms.head;
        ms.cnt+=1;

        if(ms.cnt==1){
            ms.mid= new_DDLNode;
        }
        else{
            ms.head.prev=new_DDLNode;

            if(ms.cnt%2 !=0){
               ms.mid= ms.mid.prev;
            }
            ms.head= new_DDLNode;
        }
   }
   int pop(myStack ms){
       if (ms.cnt == 0) {
           System.out.println("Stack is empty");
           return -1;
       }

       DLLNode head = ms.head;
       int item = head.data;
       ms.head = head.next;

       if (ms.head != null)
           ms.head.prev = null;

       ms.cnt -= 1;
       if (ms.cnt % 2 == 0)
           ms.mid = ms.mid.next;

       return item;
   }

   int findMiddle(myStack ms){
       if (ms.cnt == 0) {
           System.out.println("Stack is empty now");
           return -1;
       }
       return ms.mid.data;
   }

    public static void main(String[] args){
        midStack ms=new midStack();
        myStack ms= ob.createStack();

        
    }

}