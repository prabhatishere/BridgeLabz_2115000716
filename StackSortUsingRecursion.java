import java.util.*;
public class StackSortUsingRecursion {
    public static Stack<Integer> sortStack(Stack<Integer> stack){
        if(stack.isEmpty()) return stack;
        int topValue = stack.pop();
        sortStack(stack);
        insertAtCorrectPosition(stack, topValue);
        return stack;
    }
    public static void insertAtCorrectPosition(Stack<Integer> stack, int topValue){
        if(stack.isEmpty() || stack.peek()<=topValue){
            stack.push(topValue);
            return;
        }
        int temp = stack.pop();
        insertAtCorrectPosition(stack, topValue);
        stack.push(temp);
    }
    public static void printStack(Stack<Integer> stack){
        while(!stack.isEmpty()){
            System.out.print(stack.pop()+" ");
        }
    }
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(23);
        stack.push(13);
        stack.push(43);
        stack.push(78);
        stack.push(90);
        Stack<Integer> sortedStack = sortStack(stack);
        printStack(sortedStack);
    }
}
