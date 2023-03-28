package f3.Stacks;

import java.util.Stack;

public class ReverseStack {
    public static void reverseStack(Stack<Integer> input,Stack<Integer> extra) {
        if(input.size()==0||input.size()==1){
            return ;
        }
        int temp=input.pop( );
        reverseStack(input,extra);
         while(!input.isEmpty()){
             extra.push(input.pop());
         }
         while (!extra.isEmpty()){
             input.push(extra.pop());
         }

    }

    public static boolean checkRedundantBrackets(String expression) {

        Stack<Character> stack=new Stack<>();

        int count=0;

        for (int i = 0; i < expression.length(); i++) {

            if(expression.charAt(i)!=')'){
                stack.push(expression.charAt(i));

            }else if(expression.charAt(i)==')'){
                boolean hasOperator=false;

                while(!stack.isEmpty()&&stack.peek()!='('){
                    stack.pop();
                    hasOperator=true;
                }
                if(!hasOperator){
                    return true;

                }
                if(!stack.isEmpty()){
                    stack.pop();
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {

    }
}
