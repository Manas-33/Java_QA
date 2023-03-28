package f3.Stacks;

import java.util.Stack;

public class StackCollections {
    public static void main(String[] args) {
//        Stack<Integer> stack= new Stack<>();
//        stack.push(10);
////        stack.push(10);
////        stack.push(20);
//
//        System.out.println(stack.size());
//        System.out.println(stack.peek());
//        System.out.println(stack.pop());
//        System.out.println(stack.isEmpty());
        Stack<Integer> stack=new Stack<>();
        stack.push(5);
        stack.push(10);
        stack.push(15);
        System.out.print(stack.pop()+stack.size());
    }
}
