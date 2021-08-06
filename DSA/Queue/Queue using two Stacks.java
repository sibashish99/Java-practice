/**
 Implement a Queue using 2 stacks s1 and s2 .
A Query Q is of 2 Types
(i) 1 x (a query of this type means  pushing 'x' into the queue)
(ii) 2   (a query of this type means to pop element from queue and print the poped element)

Example 1:

Input:
5
1 2 1 3 2 1 4 2

Output: 
2 3

Explanation: 
In the first testcase
1 2 the queue will be {2}
1 3 the queue will be {2 3}
2   poped element will be 2 the queue 
    will be {3}
1 4 the queue will be {3 4}
2   poped element will be 3.
 */


class StackQueue
{
    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();

    //Function to push an element in queue by using 2 stacks.
    void Push(int data)
    {
	   // Your code here
	   while (!stack1.isEmpty()){
	       stack2.push(stack1.pop());
	   }
       stack1.add(data);
    
       while (!stack2.isEmpty()){
           stack1.push(stack2.pop());
       }
          
    }
	
    
    //Function to pop an element from queue by using 2 stacks.
    int Pop()
    {
	   // Your code here
	   if(stack1.isEmpty()){
	       return -1;
	   }  
	   return stack1.pop();
    }
}


