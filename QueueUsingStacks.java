import java.util.Stack;

public class QueueUsingStacks{
    Stack<Integer> stack1;
    Stack<Integer> stack2;
    public QueueUsingStacks(){
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }

    public void push(int data){
        stack1.push(data);
    }
    public int pop(){
        if(stack1.isEmpty() && stack2.isEmpty()){
            System.out.println("Queue is Empty....UnderFlow");
            return -1;
        }
        while(!stack1.isEmpty()){
            stack2.push(stack1.pop());
        }
        int ans = stack2.pop();
        while(!stack2.isEmpty()){
            stack1.push(stack2.pop());
        }
        return ans;
    }
    public int peek(){
        while(!stack1.isEmpty()){
            stack2.push(stack1.pop());
        }
        int ans = stack2.peek();
        while(!stack2.isEmpty()){
            stack1.push(stack2.pop());
        }
        return ans;
    }
    public boolean empty(){
        if(stack1.isEmpty() && stack2.isEmpty()) return true;
        return false;
    }
    public static void main(String[] args) {
        QueueUsingStacks queue = new QueueUsingStacks();
        queue.push(1);
        queue.push(2);
        queue.push(3);
        System.out.println(queue.pop());  
        System.out.println(queue.peek()); 
        System.out.println(queue.pop());  
        System.out.println(queue.empty()); 
        System.out.println(queue.pop());  
        System.out.println(queue.empty()); 
        queue.push(10);
        System.out.println(queue.pop());  
        System.out.println(queue.empty()); 
        System.out.println(queue.empty()); 
        System.out.println(queue.pop());
        queue.push(5);
        queue.push(6);
        System.out.println(queue.pop());  
        queue.push(7);
        System.out.println(queue.pop());  
        System.out.println(queue.peek()); 
        System.out.println(queue.pop());  
        System.out.println(queue.empty()); 



    }
}
