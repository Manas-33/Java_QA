package f3.Stacks;

import java.util.Stack;

public class balancedParenthesis {
    public static boolean isBalanced(String expression) {

        Stack<Character> stack=new Stack<>();

        for (int i = 0; i < expression.length(); i++) {
            if (expression.charAt(i)=='('){
                stack.push(expression.charAt(i));
            }else if(expression.charAt(i)==')'){
                if (stack.isEmpty()){
                    return false;
                }
                char topChar=stack.pop();
                if (expression.charAt(i)==')' && topChar=='('){
                    continue;
                }else{
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
