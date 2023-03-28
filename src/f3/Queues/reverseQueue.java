package f3.Queues;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class reverseQueue {
    public static void reverseQueue(Queue<Integer> input) {
        Stack s = new Stack();

        while (!input.isEmpty()) {
            s.push(input.poll());
        }
        while (!s.isEmpty()){
            input.add((Integer) s.pop());
        }
        while(!input.isEmpty()){
            System.out.println(input.poll());
        }

    }


//        while (!stack.isEmpty()) {
//            queue.add(stack.peek());
//            stack.pop();
//        }
    }

