class myQueue{
     int[] arr;
     int rear;
     int front;
     int size;
     int capacity;

     public myQueue(int capacity){
         this.capacity = capacity;
         arr = new int[capacity];
         rear = capacity - 1;
         front = this.size= 0;
     }

     boolean isFull(myQueue mq){
         return (mq.size == mq.capacity);
     }
     boolean isEmpty(myQueue mq){
         return (mq.size == 0);   
     }
     void enqueue(int value){
         if(isFull(this)){
             return;
         }
         this.rear = (this.rear +1)%this.capacity;
         this.arr[this.rear] = value;
         this.size+=1;
         System.out.println(value+" enqued to queue");
     }
     public int dequeue(){
         if(isEmpty(this)){
             return -1;
         }
         int item= this.arr[this.front];
         this.front = (this.front +1)%this.capacity;
         this.size-=1;
         return item;
     }
     public int front(){
         if(isEmpty(this)){
             return -1;
         }
         return this.arr[this.front];
     }
     public int rear(){
         if(isEmpty(this)){
             return -1;
         }
         return this.arr[this.rear];
     }
     public int size(){
         return size;
     }

}
public class queueArray{
    public static void main(String[] args){
        myQueue mq = new myQueue(10);
        mq.enqueue(1);
        mq.enqueue(2);
        mq.enqueue(3);
        mq.enqueue(4);  
        mq.enqueue(5);

        System.out.println(mq.front());
        System.out.println(mq.rear());
        System.out.println(mq.dequeue()+" is deleted");
    }
}