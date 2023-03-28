package f3.Stacks;

import java.util.Stack;

public class StockSpan {

    public static int[] stockSpan(int[] price) {

        int  span[]=new int[price.length];
        Stack<Integer> stack =new Stack<>();

        stack.push(0);
        span[0]=1;

        for (int i = 1; i < price.length; i++) {
            while (!stack.isEmpty()&&price[stack.peek()]<price[i]){
                stack.pop();
            }
            if(stack.isEmpty()){
                span[i]=i+1;
            }else{
                span[i]=i-stack.peek();

            }
            stack.push(i);

        }


        return span;
    }
}
