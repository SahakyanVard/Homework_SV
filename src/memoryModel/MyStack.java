package memoryModel;

import java.util.Stack;

public class MyStack {
    public static void main(String[] args) {
        // Parentheses problem: (){}[]
        String parentheses="({[77]}){ggh}";
        System.out.println(isCorrect(parentheses));
    }

    private static boolean isCorrect(String parentheses) {
        Stack<Character> stack=new Stack<>();
        for (int i = 0; i < parentheses.length(); i++) {
            char element=parentheses.charAt(i);
            if (element=='('||element=='{'||element=='['){
                stack.push(element);
                continue;
            }
            switch (element){
                case ')':if (stack.empty()||stack.pop()!='('){
                    return false;
                }
                    break;
                case '}':if (stack.empty()||stack.pop()!='{'){
                    return false;
                }
                    break;
                case ']':if (stack.empty()||stack.pop()!='['){
                    return false;
                }
                    break;
            }
        }
        return stack.isEmpty();
    }
}
