package f3.Stacks;

public class StackUse {
    public static void main(String[] args) throws StackFullException, StackEmptyException {

//        StackArray stack =new StackArray();
//        System.out.println(stack.isEmpty());
//        stack.push(10);
//        stack.push(20);
//        stack.push(30);
//        stack.push(40);
//        stack.push(50);
//        stack.push(60);
//        stack.push(70);
//        stack.push(80);
//        stack.push(90);
//        System.out.println(stack.size());
//        System.out.println(stack.pop());
//        System.out.println(stack.top());

        StackLL<Integer> stackL= new StackLL<>();
        int[] arr={5,6,7,2,9};
        for (int i = 0; i < arr.length; i++) {
            stackL.push(arr[i]);
        }

        while(!stackL.isEmpty()){
            System.out.println(stackL.pop());
        }

    }

}
